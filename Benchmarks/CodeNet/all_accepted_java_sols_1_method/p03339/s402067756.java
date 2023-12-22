import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char c[] = s.toCharArray();
		int max = 0;
		int ans = n;
		int nenn=0;
		for (int i = 0; i < n; i++) {
			if (c[i] == 'E') {
				max++;
			}
		}
		nenn=max;
		for (int i = 0; i < n; i++) {
			if (c[i] == 'E') {
				max--;
			} else {
				max++;
			}
			if (ans > max) {
				ans = max;

}
		}
		System.out.println(Math.min(nenn, ans));
	}
}