import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int head = 0;
		int quantum = 0;
		boolean flg;
		
		//プロセス数
		int n = scan.nextInt();
		String data[][] = new String[n][2];
		int count = n;
		int top = n - 1;
		
		//クオンタム
		int q = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			for ( int j = 0; j < 2; j++) {
				data[i][j] = scan.next();
			}
		}
		scan.close();
		
		while (count > 0) {
			flg = false;
	
			if ( data[head][1].equals("-")) {
			} else {
				int x = Integer.parseInt(data[head][1]);
				if ( x < q) {
					quantum += x % q;
					flg = true;
				} else if (x == q) {
					quantum += q;
					flg = true;
				} else {
					x -= q;
					quantum += q;
				}
				if (flg) {
					data[head][1] = "-";
					count--;
					System.out.println(data[head][0] + " " + quantum);	
				} 
			}
			head = head + 1;
			if (head > top) head = 0;
		}	
	}
}
