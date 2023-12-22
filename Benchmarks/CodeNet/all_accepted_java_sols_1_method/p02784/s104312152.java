import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			h -= a;
		}
		String ans = h <= 0 ? "Yes" : "No";
		System.out.println(ans);
		sc.close();
	}
}
