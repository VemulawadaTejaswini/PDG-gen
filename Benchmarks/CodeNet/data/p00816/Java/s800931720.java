import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void quickSort(int[] a, int[] b, int l, int r) {
		if (l < r) {
			int w2 = a[(l+r)/2];
			
			int i = l, j = r, temp, temp2;
			while (i < j) {
				while (a[i] > w2) i++;
				while (a[j] < w2) j--;
				if (i <= j) {
					temp = a[i];
					a[i] = a[j]; a[j] = temp;
					temp2 = b[i];
					b[i] = b[j]; b[j] = temp2;
					i++; j--;
				}
			}
			quickSort(a, b, l, j);
			quickSort(a, b, i, r);
		}
	}
	
	void run() {
		while (true) {
			int t = sc.nextInt();
			String number = sc.next();
			if (t == 0 && number.equals("0")) break;
			
			char[] n = number.toCharArray();
			int l = n.length;
			int m = 1<<(l-1);
			int[] num = new int[m];
			int[] cut = new int[m];
			
			int c = 0;
			for (int i = 0; i < 1<<(l-1); i++) {
				int v = 0;
				int value = 0;
				for (int j = 0; j < l-1; j++) {
					v = v*10 + Character.getNumericValue(n[j]);
					if ((i & 1<<j) != 0) {
						value += v;
						v = 0;
					}
				}
				value += v*10 + Character.getNumericValue(n[l-1]);
				if (value <= t) {
					num[c] = value;
					cut[c] = i;
					c++;
				}
			}
			
			quickSort(num, cut, 0, m-1);
			if (num[0] == 0) {
				out.println("error");
			} else if (num.length > 1 && num[0] == num[1]) {
				out.println("rejected");
			} else {
				out.printf("%d", num[0]);
				int v = 0;
				for (int j = 0; j < l-1; j++) {
					v = v*10 + Character.getNumericValue(n[j]);
					if ((cut[0] & 1<<j) != 0) {
						out.printf(" %d", v);
						v = 0;
					}
				}
				out.printf(" %d\n", v*10 + Character.getNumericValue(n[l-1]));
			}
			
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}