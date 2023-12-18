import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		final int n = scan.nextInt();
		String[] str = new String[n];
		int[] number = new int[n];
		
		final int q = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			str[i] = scan.next();
			number[i] = scan.nextInt();
		}
		scan.close();
		
		Queue (str, number, q);
		
	}
	
	static void Queue (String[] str, int[] number, int q) {
		int quantum = 0;
		int head = 0;
		int done = 0;
		int max = number.length;
		
		while (true) {
			if ( number[head] > 0) {
				number[head] -= q;
				quantum += q;
				if (number[head] <= 0) {
					quantum += number[head];
					done++;
					System.out.println(str[head] + " " + quantum);
				}
			}
			
			if (done == max) break;
			
			if (head + 1 == max) {
				head = 0;
			} else head++;
		}
	}
}
