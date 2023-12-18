import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		long total = 0;
		
		int n = scan.nextInt();
		long[] a = new long[n];
		
		long tall = 0;
		int x = -1;
		int same = 1;
		
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
			
			if(tall < a[i]) {
				tall = a[i];
				x = i;
				
			}
			else if(tall == a[i]) {
				same++;
			}
		}
		
		if(same == n) {
			System.out.print(0);
			return;
		}
		if(x == n-1) {
			System.out.print(0);
			return;
		}
		if(x == 0) {
			for(int i = 0; i < n; i++) {
				total += tall - a[i];
			}
			System.out.print(total);
			return;
		}
		if(x == n-2) {
			total += tall - a[n-1];
			n = x;
		}
		
		while(true) {
			long big = 0;
			int index = 0;
			int same1 = 1;
			for(int i = 0; i < n; i++) {
				if(big < a[i]) {
					big = a[i];
					index = i;
				}
				else if(big == a[i]) {
					same1++;
				}
			}
			if(same1 == n) {
				n = index;
				if( index == 0 && n == 0) {
					break;
				}
				continue;
			}
			for( int i = index; i < n; i++) {
				total += big - a[i];
			}
			n = index;
			
			if( index == 0 && n == 0) {
				break;
			}
		}
		System.out.print(total);
	}

}
