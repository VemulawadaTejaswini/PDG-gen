import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		StringBuilder sb = new StringBuilder();
		int max = 0;
		final int n = scan.nextInt();
		int[] sequence = new int[n];
		int[] output = new int[n];
		
		for (int i = 0; i < n; i++) {
			sequence[i] = scan.nextInt();
			max = Math.max(max, sequence[i]);
		}
		scan.close();
		
		CountingSort (sequence, output, max);
		
		
		sb.append(output[0]);
		
		for (int i = 1; i < n; i++) {
			sb.append(" " + output[i]);
		}
		
		System.out.println(sb);
		
	}
	
	static void CountingSort (int[] input, int[] output, int k) {
		int n = input.length;
		int[] count = new int[k + 1];
		
		Arrays.fill(count, 0);
		
		for (int i = 0; i < n; i++) {
			count[input[i]]++;
		}
		
		for (int i = 1; i <= k; i++) {
			count[i] += count[i - 1];
		}
		
		for (int i = n - 1; i >= 0; i--) {
			output[--count[input[i]]] = input[i];
		}
	}

}

