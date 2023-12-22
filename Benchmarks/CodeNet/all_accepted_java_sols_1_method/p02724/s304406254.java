import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		
		long num500 = x / 500;
		x %= 500;
		long num5 = x / 5;
		long ans = num500 * 1000 + num5 * 5;
		System.out.println(ans);
		
		sc.close();
	}
}
