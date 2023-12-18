import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){


			long mod = 998244353;

			int N = scan.nextInt();
			int K = scan.nextInt();

			int[]L = new int[K];
			int[]R = new int[K];
			long[]d = new long[N];
			d[0] = 1;

			Map<Integer,Integer>map  = new TreeMap<Integer,Integer>();

			for(int i = 0;i<K;i++) {
				L[i] = scan.nextInt();
				R[i] = scan.nextInt();
				for(int j=L[i];j<=R[i];j++) {
					map.put(j, 0);
				}

			}

			for(int i =1;i<N;i++) {
				for(Integer key:map.keySet()) {

					int a = key;

					if(i-a>=0) {

						d[i]  = (d[i]+d[i-a])%mod;
						//System.out.println(i+" "+d[i]);
					}

				}
				//System.out.println();

			}

			System.out.println(d[N-1]);








		}


	}


}
