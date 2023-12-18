import java.util.Scanner;

public class Main {
	static int quantum = 0;
	static final String END = "0";
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		//プロセス数
		int n = scan.nextInt();
		String[] str = new String[n];
		int[] data = new int[n];
		
		//クオンタム
		int q = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			str[i] = scan.next();
			data[i] = scan.nextInt();
		}
		scan.close();
		
		Queue(str, data, n, q);
		
	}
	
	public static void Queue (String[] str, int[] data, int n, int q) {
		int count = n;
		int head = 0;
		int top = n - 1;
		
		while (count > 0) {
			if ( data[head] == 0) {
			} else {
				data[head] = Quantum(data[head], q);
				if (data[head] == 0) {
					count--;
					System.out.println(str[head] + " " + quantum);	
				} 
			}
			head = head + 1;
			if (head > top) head = 0;
		}
	}
	
	public static int Quantum(int x, int q) {
		
		if ( x < q) {
			quantum += x % q;
			return 0;
		} else if (x == q) {
			quantum += q;
			return 0;
		} else {
			x -= q;
			quantum += q;
		}
		
		return x;
		
	}
}
