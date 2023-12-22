import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
		System.out.println(n/(a+b)*a+Math.min(n%(a+b),a));
	}
}