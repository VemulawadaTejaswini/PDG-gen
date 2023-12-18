import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			String[] s = new String[n];
			for(int i = 0; i < n; i++) {
				s[i] = sc.next();
			}
			Integer[] a = new Integer[8];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < 8; j++) {
					a[j] = s[i].charAt(j) - '0';
				}
				Arrays.sort(a);
				String t = "";
				for(int j = 0; j < 8; j++) {
					t += Integer.toString(a[j]);
				}
				int min = Integer.parseInt(t);
				Arrays.sort(a, Collections.reverseOrder());
				t = "";
				for(int j = 0; j < 8; j++) {
					t += Integer.toString(a[j]);
				}
				int max = Integer.parseInt(t);
				System.out.println(max - min);
			}
		}
		sc.close();
	}
}
