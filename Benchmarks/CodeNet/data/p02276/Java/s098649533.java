import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		final int n = scan.nextInt();
		int[] sequence = new int[n];
		
		for (int i = 0; i < n; i++) {
			sequence[i] = scan.nextInt();
		}
		scan.close();
		
		Partition (sequence, 0, n - 1);
		
		
	}
	
	static void Partition (int[] array, int p, int r) {
		int x = array[r];
		int i = p - 1;
		int temp;
		
		for (int j = p; j < r; j++) {
			if (array[j] <= x) {
				i++;
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		
		array[r] = array[i + 1];
		array[i + 1] = x;
		
		printArray (array, i + 1);
		
		
		
	}
	
	static void printArray (int[] data, int x) {
		int n = data.length;
		for (int i = 0; i < n; i++) {
			if ( i != n - 1) {
				if ( i != x) System.out.print(data[i] + " ");
				else System.out.print("[" +data[i] + "] "); 
			}
			else System.out.println(data[i]);
		}
	}

	
}

