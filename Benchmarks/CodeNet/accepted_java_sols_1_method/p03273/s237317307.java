
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		boolean[] h2 = new boolean[h];
		boolean[] w2 = new boolean[w];
		String[] a = new String[h];
		for (int i = 0; i < h; i++) {
			String s = sc.next();
			a[i] = s;
			if (s.contains("#")) {
				h2[i] = true;
			}
			
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '#') {
					w2[j] = true;
				}
			}
		}
		
		for (int i = 0; i < h; i++) {
			if (h2[i]) {
				for (int j = 0; j < w; j++) {
					if (w2[j]) {
						System.out.print(a[i].charAt(j));
					}
				}
				System.out.println();
			}
		}
	}
}
