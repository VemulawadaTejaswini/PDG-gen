import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int c = sc.nextInt();
		int a, b;
		int[] wide = new int[w];
		for (int i = 0; i < w; i++) {
			wide[i] = i + 1;
		}
		for (int i = 0; i < c; i++) {
			String line = sc.nextLine();
			a = Integer.parseInt(line.charAt(0));
			b = Integer.parseInt(line.charAt(2));
			swap(wide[a], wide[b]);
		}
		for (int i  = 0; i < w; i++) {
			System.out.println(wide[i]);
		}
	}
	public static void swap(int x, int y) {
		int z;
		z = x;
		x = y;
		y = z;
	}
}