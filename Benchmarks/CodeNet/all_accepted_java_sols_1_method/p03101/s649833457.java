import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();
		int h2 = sc.nextInt(), w2 = sc.nextInt();
		sc.close();
		int ans = h2 * w + w2 * h;
		ans -= h2 * w2;
		ans = h * w - ans;
		System.out.println(ans);
		
	}

}
