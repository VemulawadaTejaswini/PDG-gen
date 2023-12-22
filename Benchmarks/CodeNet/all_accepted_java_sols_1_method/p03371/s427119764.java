import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int ab = Math.min(a + b, c * 2);
		
		int ans = Math.min(x, y) * ab;
		
		if (x > y) {
			ans += (x - y) * Math.min(a, c * 2);
		} else {
			ans += (y - x) * Math.min(b, c * 2);
		}
		
		System.out.println(ans);
	}	
}
