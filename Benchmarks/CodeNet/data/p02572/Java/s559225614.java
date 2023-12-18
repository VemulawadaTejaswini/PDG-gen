import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		
		ArrayList<Long> array = new ArrayList<Long>();
		
		for( int i = 0; i < n; i++) {
			array.add(scan.nextLong());
		}
		
		long total = 0;
		
		for(int i = 0; i < n-1; i++) {
			if(total >= 1000000007) {
				total -= 1000000007;
			}
			for(int j = i+1; j < n; j++) {
				
				total += array.get(i) * array.get(j);
				
				long a = total %  1000000007;
				
				total = a;
				
				if(total >= 1000000007) {
					total -= 1000000007;
				}
				
			}
		}
		
		System.out.print(total);
	}

}
