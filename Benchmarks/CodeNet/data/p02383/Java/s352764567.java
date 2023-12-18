
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice d=new Dice(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		String ord=sc.next();
		for(int i=0; i<ord.length(); i++){
			if(ord.charAt(i)=='E'){
				d.rollE();
			}else if(ord.charAt(i)=='W'){
				d.rollW();
			}else if(ord.charAt(i)=='N'){
				d.rollN();
			}else if(ord.charAt(i)=='S'){
				d.rollS();
			}
			
		}

		System.out.println(d.top);

	}

}

 class Dice{
	int top;
	int bottom;
	int w;
	int s;
	int n;
	int e;
	Dice(int a,int b,int c, int d,int e,int f){
		this.top=a;
		this.bottom=f;
		this.s=b;
		this.e=c;
		this.w=d;
		this.n=e;


	}

	void rollE(){
		int temp=top;
		top=w;
		e=temp;
		temp=bottom;
		bottom=e;
		w=temp;

	}
	void rollW(){
		int temp=top;
		top=e;
		w=temp;
		temp=bottom;
		bottom=w;
		e=temp;

	}

	void rollN(){
		int temp=top;
		top=s;
		n=temp;
		temp=bottom;
		bottom=n;
		s=temp;
	}
	void rollS(){
		int temp=top;
		s=temp;
		top=n;
		temp=bottom;
		bottom=s;
		n=temp;


	}









}
