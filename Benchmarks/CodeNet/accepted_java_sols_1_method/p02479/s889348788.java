import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double pi = Math.PI;
		double ans1 = pi*r*r;
		double ans2 = 2*pi*r;
		System.out.printf("%f %f",ans1,ans2);
	}
}