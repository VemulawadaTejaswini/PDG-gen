import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String[] s = new String[n];
		for (int i = 0; i < n; i++)
			s[i] = sc.next();
		Arrays.sort(s);
		int m = Integer.parseInt(sc.next());
		String[] t = new String[m];
		for (int i = 0; i < m; i++)
			t[i] = sc.next();
		Arrays.sort(t);
		int max = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			while (count + i < n && s[i].equals(s[count + i]))
				count++;
			int index = -1;
			for (int j = 0; j < m; j++) {
				if (s[i].equals(t[j])) {
					index = j;
					break;
				}
			}
			int countj = 0;
			if (index != -1) {
				while (countj + index < m && s[i].equals(t[countj + index]))
					countj++;
			}
			if (count - countj > max)
				max = count - countj;
		}
		System.out.println(max);
	}
}