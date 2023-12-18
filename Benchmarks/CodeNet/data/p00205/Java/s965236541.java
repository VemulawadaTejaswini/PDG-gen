import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean g, t, p;
		int a[] = new int[5];

		while (true) {
			g = t = p = false;
			a[0] = sc.nextInt();
			if (a[0] == 0) {
				break;
			}
			a[1] = sc.nextInt();
			a[2] = sc.nextInt();
			a[3] = sc.nextInt();
			a[4] = sc.nextInt();
			for (int i = 0; i < 5; i++) {
				if (a[i] == 1) {
					g = true;
				} else if (a[i] == 2) {
					t = true;
				} else {
					p = true;
				}
			}
			if ((g && t && p) || (g && !t && !p) || (!g && t && !p) || (!g && !t && p)) {
				for (int i = 0; i < 5; i++) {
					System.out.println("3");
				}
			} else {
				if (g && t && !p) {
					for (int i = 0; i < 5; i++) {
						if (a[i] == 1) {
							System.out.println("1");
						} else {
							System.out.println("2");
						}
					}
				} else if (g && !t && p) {
					for (int i = 0; i < 5; i++) {
						if (a[i] == 3) {
							System.out.println("1");
						} else {
							System.out.println("2");
						}
					}
				} else if (!g && t && p) {
					for (int i = 0; i < 5; i++) {
						if (a[i] == 2) {
							System.out.println("1");
						} else {
							System.out.println("2");
						}
					}
				}
			}
		}
	}
}