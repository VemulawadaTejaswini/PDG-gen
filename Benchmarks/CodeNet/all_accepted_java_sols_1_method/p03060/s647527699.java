import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int [] v = new int[n]; //宝石の価値
		int [] c = new int[n]; //宝石のコスト
		
		for(int i = 0; i < n; i++) {
			v[i] = stdIn.nextInt();
		}
		for(int i = 0; i < n; i++) {			
			c[i] = stdIn.nextInt();
		}

		int max = Integer.MIN_VALUE;
		
		for(int bit = 0; bit < (1 << n); bit++) {
			int sum = 0;
			
			for(int i = 0; i < n; i++) {
				if(((bit >> i) & 1) ==1) {
					sum+= v[i]-c[i];
				}
			}
			
			max = Math.max(sum, max);
			
		}
		
		System.out.println(max);
		
	}

}
