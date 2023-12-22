import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		sc.close();
		int ans = 24;
		ans += 24 - m;
		System.out.println(ans);
	}
}
