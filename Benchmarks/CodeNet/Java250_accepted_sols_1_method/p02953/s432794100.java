import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();
		int pre = -1;
		for (int i = 0; i < h.length; i++) {
			if (pre <= h[i] - 1)
				pre = h[i] - 1;
			else if (pre <= h[i]) {
				pre = h[i];
			} else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}