import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		ans = x-a-((x-a)/b)*b;
		
		System.out.println(ans);

		sc.close();
	}
}
