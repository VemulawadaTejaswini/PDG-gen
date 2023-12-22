import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int x = sc.nextInt();
			if (n == 0 && a == 0 && b == 0 && c == 0 && x == 0) break;
			List<Integer> ys = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				ys.add(sc.nextInt());
			}
			int count = 0;
			int size = ys.size();
			int i = 0;
			for (; count <= 10000; count++) {
				if (ys.get(i) == x) {
					i++;
				}
				if (i >= size) {
					break;
				} else {
					x = (a * x + b) % c; 
				}
			}
			if (count > 10000) {
				System.out.println(-1);
			} else {
				System.out.println(count);
			}
		}
	}
}