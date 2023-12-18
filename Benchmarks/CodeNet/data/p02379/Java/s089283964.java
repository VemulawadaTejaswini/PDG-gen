import java.util.Scanner;
import java.lang.Math;

class Main{
	public static void main(String[] arg){
	
		
		
		Scanner sc = new Scanner(System.in);
		double x1,y1,x2,y2;
		 x1=sc.nextDouble();
		 y1=sc.nextDouble();
		 x2=sc.nextDouble();
		 y2=sc.nextDouble();
		 
		double num=Math.sqrt(Math.abs((x1-x2)*(x1-x2))+Math.abs((y1-y2)*(y1-y2)));
	  
		System.out.printf("%.8f",num);
}
}
