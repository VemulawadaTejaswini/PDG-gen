import java.util.HashSet;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			long[] a = new long[n];
			HashSet<Long> h = new HashSet<Long>();
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextLong();
			}
			
			for(int i=0;i<n;i++) {
				if(h.contains(a[i])) {
					h.remove(a[i]);
				}else {
					h.add(a[i]);
				}
			}
			
			System.out.println(h.size());
			
	    }
		
		
	}
