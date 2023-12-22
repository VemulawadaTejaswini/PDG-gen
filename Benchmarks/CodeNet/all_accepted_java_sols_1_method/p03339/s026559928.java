import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char c[] = sc.next().toCharArray();
		int e[] = new int[n];
		int w[] = new int[n];
		Arrays.fill(e, 0);
		Arrays.fill(w, 0);
		for(int i = 1; i < n; i++) {
			w[i] = w[i - 1];
			if(c[i - 1] == 'W') w[i]++;
		}
		for(int i = n - 2; i >= 0; i--) {
			e[i] = e[i + 1];
			if(c[i + 1] == 'E') e[i]++;
		}
		int min = n;
		for(int i = 0; i < n; i++) {
			if(min > e[i] + w[i]) {
				min = e[i] + w[i];
			}
		}
		System.out.println(min);
	}
}