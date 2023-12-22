import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		
		int a = P + Q;
		int b = P + R; 
		int c = Q + R;
		
		int x = Math.min(a, b);
		int ans = Math.min(x, c);
		
		System.out.println(ans);
	}
}
