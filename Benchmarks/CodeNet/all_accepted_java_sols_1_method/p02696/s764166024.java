import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long b = sc.nextLong();
		long n = sc.nextLong();
		
		long x = Math.min(n, b-1);
		
		System.out.println((int) (Math.floor(a*x/b)-a*Math.floor(x/b)));
	}

}