import java.util.Scanner;

//B	Touitsu
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf(sc.nextLine());
		String A = sc.nextLine();
		String B = sc.nextLine();
		String C = sc.nextLine();

		int ans = 0;
		for (int i = 0; i < N; i++) {
			char cA = A.charAt(i);
			char cB = B.charAt(i);
			char cC = C.charAt(i);
			if (cA == cB && cA != cC && cB != cC) {
				ans++;
			}
			if (cA != cB && cA == cC && cB != cC) {
				ans++;
			}
			if (cA != cB && cA != cC && cB == cC) {
				ans++;
			}
			if (cA != cB && cA != cC && cB != cC) {
				ans++;
				ans++;
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
