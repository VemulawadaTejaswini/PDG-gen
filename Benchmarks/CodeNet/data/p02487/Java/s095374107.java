import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, w, i, j;
		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if (h == 0 && w == 0) break;
			else {
				for (i = 0; i < w; i ++) System.out.print("#");
				System.out.print("\n");
				for (j = 1; j < h - 1; j ++) {
					System.out.print("#");
					for (i = 1; i < w - 1; i ++) System.out.print(".");
					System.out.println("#");
				}
				for (i = 0; i < w; i ++) System.out.print("#");
				System.out.print("\n\n");
			}
		}
	}
}import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, w, i, j;
		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if (h == 0 && w == 0) break;
			else {
				for (i = 0; i < w; i ++) System.out.print("#");
				System.out.print("\n");
				for (j = 1; j < h - 1; j ++) {
					System.out.print("#");
					for (i = 1; i < w - 1; i ++) System.out.print(".");
					System.out.println("#");
				}
				for (i = 0; i < w; i ++) System.out.print("#");
				System.out.print("\n\n");
			}
		}
	}
}