import java.util.*;

import javax.xml.crypto.Data;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			Integer[] a = new Integer[n];
			Integer[] b = new Integer[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			Arrays.sort(a, new myComp());
			Arrays.sort(b, new myComp());
			int w = 0;
			int l = 0;
			int d = 0;
			int ix = -1;
			
			for(int i = 0; i < n; i++) {
				if(a[i].intValue() > b[i].intValue()) {
					w++;
				}
				if(w > (i+1) / 2) {
					ix = i+1;
					break;
				}
				
			}
			if(ix == -1 || ix == n) {
				System.out.println("NA");
			}
			else {
				System.out.println(ix);
			}
			
			
			
			
		}
	}
	
	static class myComp implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1.intValue() < o2.intValue())
				return 1;
			if(o1.intValue() > o2.intValue())
				return -1;
			return 0;
		}
		
	}

	
}