import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n =sc.nextLong();
		int f = (int)Math.floor((double)100*sc.nextDouble());
		long temp = n*f;
		temp*=0.01;
		System.out.println(temp);
	}
}