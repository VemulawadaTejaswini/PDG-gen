import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = Integer.parseInt(sc.next());
		int G = Integer.parseInt(sc.next());
		sc.close();

		int ans = G * 2 - R;
		System.out.println(ans);
	}
}