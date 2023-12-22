import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		int sum = 0;
		for(int i =0; i < n; i++) {
			w[i] = sc.nextInt();
			sum += w[i];
		}
		int min = Integer.MAX_VALUE / 10;
		for(int i = 1; i < n; i++) {
			int a = 0; int b = 0;
			for(int j = 0; j < i; j++) {
				a += w[j];
			}
			b = sum - a;
			int score = Math.abs(a - b);
			if (min > score)min = score;
		}
		out.println(min);
		
	}
}