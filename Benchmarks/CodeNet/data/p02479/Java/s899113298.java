import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		double s=x*x*3.141592653589;
		double r=x*2.0*3.141592653589;
		System.out.printf("%.6f %.6f\n",s,r);
		sc.close();
	}
}