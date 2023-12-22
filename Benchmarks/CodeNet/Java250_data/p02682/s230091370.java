import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		
		int ans = k <= a ? k : k <= a + b ? Math.min(k, a) : a - Math.min(k - a - b, c); 
		
		System.out.println(ans);
	}
}
