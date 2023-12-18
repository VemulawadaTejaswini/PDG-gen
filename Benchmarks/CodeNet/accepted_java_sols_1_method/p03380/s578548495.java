import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] x = new Integer[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		Arrays.sort(x, Collections.reverseOrder());

		int a = x[0];
		int b = 0;
		int minDif = x[0];
		for(int i = 1; i < n; i++) {
			int dif = Math.abs(a/2 - x[i]);
			if (dif == 0) {
				b = x[i];
				break;
			} else if(dif < minDif) {
				minDif = dif;
				b = x[i];
			}
		}
		System.out.println(a + " " + b);
	}
}
