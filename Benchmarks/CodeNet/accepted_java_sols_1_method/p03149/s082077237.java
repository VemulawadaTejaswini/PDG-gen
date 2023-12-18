import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 4; i++) {
			a[sc.nextInt()] = 1;
		}
		if (a[1] == 1 && a[7] == 1 && a[9] == 1 && a[4] == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
