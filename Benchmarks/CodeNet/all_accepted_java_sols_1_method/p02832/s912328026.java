import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int con = 1;
		int ans = 0;

		for (int i = 0; i < N; i++) {
			if (sc.nextInt() == con) {
				con++;
			}else {
				ans++;
			}
		}
		if (con == 1) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}
}