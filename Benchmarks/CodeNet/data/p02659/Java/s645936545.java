import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n =sc.nextLong();
		double f = sc.nextDouble();
		double f2=(double)n;
		System.out.println((long)Math.floor(f*f2));
	}
}