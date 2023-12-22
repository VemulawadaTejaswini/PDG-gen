import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = Integer.parseInt(sc.next());
		int R = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());

		int ans1 = L / d;
		int ans2 = R / d;
		sc.close();

		if(L % d == 0) {
			int ans = ans2 - ans1  + 1;
			System.out.println(ans);
			return;
		}else {
			int ans = ans2 - ans1;
			System.out.println(ans);
			return;
		}

	}

}