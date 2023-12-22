import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			long[] a = new long[n];
			long[] b = new long[n];
			TreeMap<Long,Long> m = new TreeMap<Long,Long>();
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextLong();
				b[i] = sc.nextLong();
			}
			
			for(int i=0;i<n;i++) {
				m.merge(b[i], a[i], Long::sum);
			}
			
			long sum = 0;
			
			for(Map.Entry<Long, Long> e :m.entrySet()) {
				sum += e.getValue();
				if(e.getKey()<sum) {
					System.out.println("No");
					return;
				}
			}
			
			System.out.println("Yes");
	    }
		
	}
	
