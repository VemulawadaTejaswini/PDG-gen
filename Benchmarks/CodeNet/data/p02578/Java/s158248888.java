import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		long total = 0;
		
		int n = scan.nextInt();
		long[] a = new long[n];
		
		long tall = 0;
		int index = -1;
		int same = 1;
		
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
			
			if(tall < a[i]) {
				tall = a[i];
				index = i;
			}
			else if(tall == a[i]) {
				same++;
			}
		}
		
		if(same == n) {
			System.out.print(0);
			return;
		}
		
		for( int i = index; i < n; i ++) {
			total += tall - a[i];
		}
		
		while(true) {
			long big = 0;
			int index2 = 0;
			for(int i = 0; i < index; i++) {
				if(big < a[i]) {
					big = a[i];
					index2 = i;
				}
			}
			for( int i = index2; i < index; i++) {
				total += big - a[i];
			}
			index = index2;
			
			if( index == 0 && index2 == 0) {
				break;
			}
		}
		System.out.print(total);
	}

}
