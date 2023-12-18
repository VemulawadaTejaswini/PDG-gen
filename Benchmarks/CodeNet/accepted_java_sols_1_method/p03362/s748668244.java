
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int m = 55555;
		BitSet p = new BitSet(55556);
		
		for(int i = 2 ; i <= m ;i++) {
			for(int j = 2 ; j <= Math.sqrt(i) ; j++) {
				if(i % j == 0) {
					p.set(i);
				}
			}
		}
		List <Integer> L = new ArrayList<Integer>();
		
		for(int i = 2 ; i <= m ;i++) {
			if(!p.get(i)) {
				L.add(i);
			}
		}
		int []prime = new int [L.size()];
		int []num = new int [5];
		int N = L.size();
		
		for(int i = 0 ;i < N;i++) {
			prime[i] = L.get(i);
			num[(prime[i]%5)]++;
 		}
	
		int max = 0; 
		int index = 0;
		
		int cnt = 0;
		for(int i = 0 ; i < N ;i++) {
			if(prime[i] % 5 == 1) {
				System.out.println(prime[i]);
				cnt++;
			}
			if(cnt == n) {
				return;
			}
		}
	}

}
