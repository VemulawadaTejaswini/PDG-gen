import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();

		boolean flg = true;
		boolean canChange = true;
		int oh = h[0], nh;
		for (int i = 1; i < n; i++) {
			nh = h[i];
			if (oh < nh) {
				canChange = true;
			} else if (oh == nh + 1 && canChange) {
				canChange = false;
			} else if (oh != nh) {
				flg=false;
				break;
			}
			oh = nh;
		}

		System.out.println(flg ? "Yes" : "No");
	}

}