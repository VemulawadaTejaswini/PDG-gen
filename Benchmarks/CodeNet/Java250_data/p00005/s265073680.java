import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			System.out.printf("%.0f %.0f\n",GCD(a,b),LCM(a,b));
		}
	}
	static double GCD(double x,double y){
		double g=0;
		if(y==0){
			g=x;
		}else{
			g=GCD(y,x%y);
		}
		return g;
	}
	static double LCM(double x,double y){
		return x*y/GCD(x,y);
	}
	
}