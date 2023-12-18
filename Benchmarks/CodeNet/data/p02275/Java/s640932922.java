import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		final int n = scan.nextInt();
		int[] sequence = new int[n];
		int element = 0;
		
		for (int i = 0; i < n; i++) {
			sequence[i] = scan.nextInt();
			element = Math.max(element, sequence[i]);
		}
		scan.close();
		
		CountingSort (sequence, element);
		
	}
	
	static void CountingSort (int[] input, int k) {
		int n = input.length;
		int[] output = new int[n + 1];
		int[] count = new int[k + 1];
		
		Arrays.fill(count, 0);
		
		for (int i = 0; i < n; i++) {
			count[input[i]]++;
		}
		
		for (int i = 1; i <= k; i++) {
			count[i] += count[i - 1];
		}
		
		for (int i = n - 1; i >= 0; i--) {
			output[count[input[i]]] = input[i];
			count[input[i]]--;
		}
		
		printArray (output);
		
	}
	
	static void printArray (int[] data) {
		int n = data.length;
		for (int i = 1; i < n; i++) {
			if ( i != n - 1) System.out.print(data[i] + " "); 
			else System.out.println(data[i]);
		}
	}

}
