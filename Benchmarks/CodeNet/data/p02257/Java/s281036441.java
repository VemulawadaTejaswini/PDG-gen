
//implement the sieve of eratos
import java.util.Scanner;


//we will use the filter method to construct the prime table from 1 to n


public class Main {
	//we can thus use binary search to check whether i is in the table
	static final int N = 100000000;
	
	
	
	// this is no good for java, so slow
	public static boolean[] eratos(int n){
		// the original value should be false
		boolean [] table = new boolean[n+1];
		
		table[0] = table[1] = true;
		
		int k = (int)Math.sqrt(n);
		for(int i = 2; i <= k; i++) {
			if(!table[i]) {
				for(int j = 2*i; j <= n; j+=i) {
					table[j] = true;
				}
			}
		}
		
		return table;
	}
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		boolean[] table = eratos(N);
		
		int len = cin.nextInt();
		int count = 0;

		
		while(len > 0) {
			count += (!table[cin.nextInt()])? 1:0;
			len--;
		}
		System.out.println(count);
	}


}