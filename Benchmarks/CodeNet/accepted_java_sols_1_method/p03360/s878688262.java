import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int max = Math.max(a,Math.max(b,c));
		int ans = a+b+c-max;
		ans += max*(int)Math.pow(2,sc.nextDouble());
		System.out.println(ans);
		sc.close();
	}
}