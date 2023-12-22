import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double pi = Math.PI;
		System.out.printf("%f %1f",r*r*pi,2*pi*r);
		sc.close();
	}
}
