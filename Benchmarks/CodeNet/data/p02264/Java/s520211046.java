import java.util.Scanner;

class MainTest {
	public static int quantum = 0;
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
		int head = 0;
		int done = 0;
		int max = number.length;
		
		while (true) {
			if ( number[head] != 0) {
				number[head] = Quantum (number[head], q);
				if (number[head] == 0) {
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
	
	static int Quantum(int x, int q) {
		
		if ( x < q) {
			quantum += x;
			return 0;
		} else {
			quantum += q;
		}
		
		return x - q;
		
	}
	
}

