import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	public void run () throws IOException {
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(reader.readLine());
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int k = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			k = Math.max(k, a[i]);
		}
		countingSort(a, b, k);
		StringBuilder sb = new StringBuilder();
		sb.append(b[0]);
		for (int i = 1; i < n; i++) {
			sb.append(' ').append(b[i]);
		}
		System.out.println(sb.toString());
	}

	private static void countingSort(int[] a, int[] b, int k) {
		int[] c = new int[k + 1];
		for (int i = 0; i < a.length; i++) {
			c[a[i]]++;
		}
		for (int i = 1; i <= k; i++) {
			c[i] += c[i - 1];
		}
		for (int i = a.length - 1; i >= 0; i--) {
			c[a[i]]--;
			b[c[a[i]]] = a[i];
		}		
	}
}
