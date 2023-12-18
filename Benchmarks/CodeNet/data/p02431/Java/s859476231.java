import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			ArrayList<Integer> A = new ArrayList<>();
			int n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				int q = sc.nextInt();
				switch(q) {  // 文字列に対し switch を使って良い
				case 0 /* pushBack*/: {
					int x = sc.nextInt();
					A.add(x);
					break;  /* break を忘れない */
				}
				case 1 /* randomAccess*/: {
					int p = sc.nextInt();
					/* ArrayList は、a[p] の代わりに a.get(p) */
					System.out.println(A.get(p));
					break;  /* break を忘れない */
				}
				case 2: /* remove */ {
					A.remove(A.size()-1);
					break;  /* break を忘れない */
				}
				}
			}
		}
	}
}

