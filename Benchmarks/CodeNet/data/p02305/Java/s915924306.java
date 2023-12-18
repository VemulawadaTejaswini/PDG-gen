import java.util.Scanner;

class Circle {
	public float xx;
	public float yy;
	public float rr;
	public void Cricle(float x, float y, float r) {
		if(x<-1000||x>1000||y<-1000||y>1000) {
			System.out.println("error");
		}
		else if(r>1000||r<1) {
			System.out.println("error");
		}else {
			this.xx=x;
			this.yy=y;
			this.rr=r;
		}
	}
	public float getx() {
		return xx;
	}
	public float gety() {
		return yy;
	}
	public float getr() {
		return rr;
	}	
}

public class Main {
	static Circle C1,C2;
	public static void main(String[] args) {
		C1= new Circle();
		C2= new Circle();
		listenC();
		judge();
	    
	}
	public static void listenC() {
		Scanner scanner=new Scanner(System.in);
		float c1x=scanner.nextFloat();
		float c1y=scanner.nextFloat();
		float c1r=scanner.nextFloat();
		float c2x=scanner.nextFloat();
		float c2y=scanner.nextFloat();
		float c2r=scanner.nextFloat();
		C1.Cricle(c1x, c1y, c1r);
		C2.Cricle(c2x, c2y, c2r);
		if (C1==C2)System.out.println("error");
	}
	private static void judge() {
		double i;
		i=Math.sqrt((C1.getx()-C2.getx())*(C1.getx()-C2.getx())+(C1.gety()-C2.gety())*(C1.gety()-C2.gety()));
		if(i>C1.getr()+C2.getr())    
			System.out.println(4);
		else if(i==Math.abs(C1.getr()+C2.getr()))    
			System.out.println(3);
		else if(i>Math.abs(C1.getr()-C2.getr())&&i<C1.getr()+C2.getr())   
			System.out.println(2);
		else if(i==Math.abs(C1.getr()-C2.getr()))     
			System.out.println(1);
		else             
			System.out.println(0);
	}
}
