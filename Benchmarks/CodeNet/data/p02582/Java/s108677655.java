import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		sc.close();

		int cnt = 0;
		int max = 0;
		for (int i = 0; i < 3; i++) {
			if (c[i] == 'R') {
				cnt++;
			} else {
				max = Math.max(max, cnt);
				cnt = 0;
			}
		}
		max = Math.max(max, cnt);

		System.out.println(max);
	}
}
