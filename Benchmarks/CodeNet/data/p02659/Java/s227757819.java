import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n =sc.nextLong();
		double f= sc.nextDouble();
		double temp=(double)n*f*100;
		System.out.println((long)(temp/100));
	}
}