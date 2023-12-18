import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();
		double m = sc.nextDouble();
		long temp = (long)m*100;
		long temp2=temp*n;
		System.out.println((long)temp2/100);
	}
}