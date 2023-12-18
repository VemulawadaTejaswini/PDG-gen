import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, T, H, L;
		int t[], h[];

		n = sc.nextInt();
		T = sc.nextInt();
		H = sc.nextInt();
		L = sc.nextInt();
		t = new int[n];
		h = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}

		int id = 0;
		int z = 0;
		while (true) {
			if (0 < t[id]) {
				t[id]--;
				z += 10;
				T++;
			} else if (0 < h[id]) {
				h[id]--;
				z += 100;
				H++;
			} else {
				break;
			}
			if (L < T) {
				break;
			}
			if (90 <= z) {
				if ((z - 90) / 10 <= T) {
					t[id] += (z - 90) / 10;
					T -= (z - 90) / 10;
					z = 0;
				} else {
					break;
				}
			}
			id = (id + 1) % n;
		}

		System.out.println(id + 1);
	}
}