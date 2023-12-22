import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long f=n/500,f2=(n%500)/5;
		System.out.println(f*1000+f2*5);
	}
}
