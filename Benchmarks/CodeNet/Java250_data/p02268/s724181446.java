import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int count = 0;
		final int n = scan.nextInt();
		int[] dataS = new int[n + 1];
		
		for (int i = 0; i < n; i++) {
			dataS[i] = scan.nextInt();
		}
		
		final int q = scan.nextInt();
		
		for (int i = 0; i < q; i++) {
			final int search = scan.nextInt();
			count += LinearSearch (dataS, search);
		}
		scan.close();
		System.out.println(count);
	}
	
	public static int LinearSearch ( int[] data, int s) {
		
		int i = 0;
		int n = data.length - 1;
		data[n] = s;
		
		while (data[i] != s) {
			
			i++;
			if (i == n) return 0;
		}
		
		return 1;
	}
}

