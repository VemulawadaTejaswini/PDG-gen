import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] x){
		ArrayList<Float> a = new ArrayList<Float>();
		ArrayList<Float> b = new ArrayList<Float>();
		ArrayList<Float> c = new ArrayList<Float>();
		ArrayList<Float> d = new ArrayList<Float>();
		ArrayList<Float> e = new ArrayList<Float>();
		ArrayList<Float> f = new ArrayList<Float>();
		int N = 0;
		try{
			Scanner sc = new Scanner(System.in);
			while(true){
				String s = sc.nextLine();
				if(s==null||s.equals("")){
					break;
				}
				N++;
				a.add((float)Integer.parseInt((s.split(" ",0))[0]));
				b.add((float)Integer.parseInt((s.split(" ",0))[1]));
				c.add((float)Integer.parseInt((s.split(" ",0))[2]));
				d.add((float)Integer.parseInt((s.split(" ",0))[3]));
				e.add((float)Integer.parseInt((s.split(" ",0))[4]));
				f.add((float)Integer.parseInt((s.split(" ",0))[5]));
			}
		}catch(Exception err){}
		for(int i=0;i<N;i++){
			solve(a.get(i),b.get(i),c.get(i),d.get(i),e.get(i),f.get(i));
		}
    }
	public static void solve(float a, float b, float c, float d, float e, float f){
		float x;
		float y;
		if(a==0){
			y=c/b;
			x=(f-e*y)/d;
		}else if(d==0){
			y=f/e;
			x=(c-b*y)/a;
		}else if(a*e==b*d){
			System.out.println("err");
			return;
		}else{
			y=(a*f-c*d)/(a*e-b*d);
			x=(c-b*y)/a;
		}
		System.out.println(rnd(x)+" "+rnd(y));
	}
	
	public static String rnd(float n){
		boolean m = false;
		if(n<0){m=true;n*=-1;}
		n=((float)((int)(n*1000)))/1000;
		if(n%1==0||n%0.1==0){return (m?"-":"")+n+"00";}
		else if(n%0.001==0){return (m?"-":"")+n+"0";}
		else{return (m?"-":"")+n+"";}
	}
}