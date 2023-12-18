import java.util.Scanner;

class MainTest {
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
		
		Queue(str, data, q);
	}
	
	static void Queue (String[] str, int[] data, int q) {
		int count = 0;
		int quantum = 0;
		int head = 0;
		int top = data.length;
		
		while (true) {
			if ( data[head] != 0) {
				if ( data[head] < q) {
					quantum += 0;
					data[head] = 0;
					count++;
					System.out.println(str[head] + " " + quantum);
				} else {
					data[head] -= q;
					quantum += q;
				}
			}
			
			if (count == top) break;
			
			head++;
			if (head == top) head = 0;
		}
	}
}
