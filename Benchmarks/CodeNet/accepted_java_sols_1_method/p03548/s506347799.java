import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();
		int ans = 0;
		for (int i = Z; i <= X - Y - Z; i += Y + Z) {
			ans++;
		}
		sc.close();
		System.out.println(ans);
	}
}
