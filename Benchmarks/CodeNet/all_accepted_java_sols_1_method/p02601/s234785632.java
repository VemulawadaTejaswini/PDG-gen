import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		
		while (a >= b) {
			b *= 2;
			k--;
		}
		while (b >= c) {
			c *= 2;
			k--;
		}
		
		String ans = k >= 0 ? "Yes" : "No";
		System.out.println(ans);
		sc.close();
	}
	
}

