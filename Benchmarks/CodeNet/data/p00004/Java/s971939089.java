import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		double d=sc.nextInt();
		double e=sc.nextInt();
		double f=sc.nextInt();
		double x=(c*e-b*f)/(a*e-d*b);
		double y=(c-a*x)/b;
		System.out.printf("%.3f %.3f",x,y);
		sc.close();
	}
}