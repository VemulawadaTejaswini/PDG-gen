import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int an = sc.nextInt();
		int bn = sc.nextInt();
		int mn = sc.nextInt();
		List<Integer> al = new ArrayList<>();
		List<Integer> bl = new ArrayList<>();

		int mina = Integer.MAX_VALUE;
		for (int i = 0; i < an; i++) {
			int temp = sc.nextInt();
			al.add(temp);
			if (mina > temp) {
				mina = temp;
			}
		}
		int minb = Integer.MAX_VALUE;
		for (int i = 0; i < bn; i++) {
			int temp = sc.nextInt();
			bl.add(temp);
			if (minb > temp) {
				minb = temp;
			}
		}
		int minm = Integer.MAX_VALUE;
		for (int i = 0; i < mn; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			int temp = al.get(x - 1) + bl.get(y - 1) - c;
			if (minm > temp) {
				minm = temp;
			}
		}
		System.out.println(Math.min(mina + minb, minm));
	}
}
