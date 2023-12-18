import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int dotcount =Integer.parseInt(scr.nextLine());
		ArrayList<Complex> dots = new ArrayList<Complex>();
		//Complex[] dots = new Complex[dotcount];
		for(int i=0; i<dotcount; i++){
			String[] str = scr.nextLine().split(" ", 0);
			dots.add(new Complex(Integer.parseInt(str[0]), Integer.parseInt(str[1])));
		}
		ArrayList<Complex> r = CPoly(findFirst(dots)); 
		System.out.println(r.size());
		for(Complex c : r){
			System.out.println((int)c.real + " " + (int)c.image);
		}
		scr.close();
	}
	
	static ArrayList<Complex> CPoly(ArrayList<Complex> dots){
		//(new Complex(1, 1)).Div(new Complex(1, -1)).Show();
		ArrayList<Complex> cpoly = new ArrayList<Complex>();
		cpoly.add(dots.get(0).Sub(new Complex(1,0))); //???????????????????????????????????????
		cpoly.add(dots.get(0)); dots.remove(0); //????§????????????????
		
		//for(Complex c : dots) c.Show();
		
		while(dots.size()>0){
			int mini = -1; double min = Math.PI;
			Complex last = cpoly.get(cpoly.size() -1);
			Complex pre_dif = cpoly.get(cpoly.size()-1).Sub(cpoly.get(cpoly.size()-2));
			
			//System.out.print("l:");last.Show();
			//System.out.print("d:");pre_dif.Show();
			
			for(int i=0; i<dots.size(); i++){
				double d = dots.get(i).Sub(last).Div(pre_dif).Arg();// arg(a-z1/z1-z0)
				
				//System.out.print("dif:");dots.get(i).Sub(last).Show();
				//System.out.print("arg:");dots.get(i).Sub(last).Div(pre_dif).Show();
				//System.out.print(i + " ");dots.get(i).Show();
				//System.out.println(" " + (d/Math.PI));
				
				if(min > d || //????°??????´??°???arg???????????????????????????????????????
						(min == d && 
							Math.abs(dots.get(mini).Sub(last).real) > Math.abs(dots.get(i).Sub(last).real))){
					mini = i; min = d;
				}
				
				
			}
			double df = cpoly.get(1).Sub(last).Div(pre_dif).Arg();
			if(min > df || //????°??????´??°???arg???????????????????????????????????????
					(min == df && 
						Math.abs(dots.get(mini).Sub(last).real) > Math.abs(cpoly.get(1).Sub(last).real))){
				min = df; break; //??????????????£??????break
			}
			
			//System.out.print("mini ");dots.get(mini).Show();System.out.println();
			
			cpoly.add(dots.get(mini)); dots.remove(mini);
			
			//for(Complex c : dots) c.Show();System.out.println();
			//for(Complex c : cpoly) c.Show();System.out.println();
		}
		//for(Complex c : cpoly) c.Show();
		cpoly.remove(0);
		return cpoly;
	}
	
	static ArrayList<Complex> findFirst(ArrayList<Complex> dots){ //????§???????????????????
		double minx = 0;
		double miny = 0;
		int mini = 0;
		for(int i=0; i<dots.size(); i++){
			if(miny >= dots.get(i).image){
				miny = dots.get(i).image;
				if(minx > dots.get(i).real){
					minx = dots.get(i).real;
				}
				mini = i;
			}
		}
		Complex t = dots.get(mini); dots.remove(mini); dots.add(0, t);
		return dots;
	}
}
class Complex {
	double real;
	double image;
	final double NORMALIZE = 0.0000000001d;
	Complex(double r, double i){
		real = r;
		image = i;
	}
	Complex Add(Complex b){
		return new Complex(this.real + b.real, this.image + b.image);
	}
	Complex Sub(Complex b){
		return new Complex(this.real - b.real, this.image - b.image);
	}
	Complex Pow(Complex b){
		return new Complex(this.real*b.real - this.image*b.image,
				this.real*b.image + this.image*b.real);
	}
	Complex Pow(double k){
		return new Complex(this.real*k, this.image*k);
	}
	Complex Unit(){
		if(this.Norm() < NORMALIZE) return new Complex(0, 0);
		else return new Complex(this.real/this.Norm(), this.image/this.Norm());
	}
	Complex Conjugate(){
		return new Complex(this.real, - this.image);
	}
	Complex Div(Complex b){
		return this.Pow(b.Conjugate()).Pow(1.0d / b.Norm2());
	}
	double Dot(Complex b){
		return this.real * b.real + this.image * b.image;
	}
	double Norm(){
		return Math.sqrt(this.Dot(this));
	}
	double Norm2(){
		return this.Dot(this);
	}
	double Arg(){
		if(this.Norm() <= NORMALIZE) return Math.PI / 2;
		return Math.acos(this.real / Math.sqrt(this.real * this.real + this.image * this.image));
	}
	void Show(){
		if(this.image == 0){
			System.out.println(this.real);
			return;
		}
		System.out.println(this.real + ((this.image > 0)?" +":" ") + this.image + "i");
	}
	double CrossSize(Complex b){
		return Math.abs(this.real * b.image - this.image * b.real);
	}
}