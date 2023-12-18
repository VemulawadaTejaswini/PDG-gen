import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double x=sc.nextInt();
		double s=(double)x*(double)x*3.141592653589;
		double r=(double)x*2.0*3.141592653589;
		System.out.printf("%.6f %.6f\n",s,r);
	}
}