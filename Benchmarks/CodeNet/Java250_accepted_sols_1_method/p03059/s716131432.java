import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double t=sc.nextDouble();
		int n=0;
		sc.close();
		for(double i=a;i<t+0.5;i=i+a){
			n +=b;
		}
		System.out.println(n);
	}
}
