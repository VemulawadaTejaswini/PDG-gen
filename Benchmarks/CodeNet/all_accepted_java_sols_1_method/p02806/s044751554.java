import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] musics =new String[N];
		int[] m =new int[N];
		int piv =0;
		int ans =0;
		String target;

		for (int i = 0; i < N; i++) {
			musics[i] = sc.next();
			m[i] = sc.nextInt();
		}

		target = sc.next();

		for (int i = 0; i < N; i++) {
			if (musics[i].equals(target)) {
				piv = i + 1;
			}
		}

		for (int i = piv; i < N; i++) {
			ans += m[i];
		}

		System.out.println(ans);

	}
}