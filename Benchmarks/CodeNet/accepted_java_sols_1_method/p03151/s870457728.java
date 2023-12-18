import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			long[] a = new long[n];
			long[] b = new long[n];
			long suma = 0;
			long sumb = 0;
			long minus = 0;
			ArrayList<Long> list = new ArrayList<Long>();
			
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextLong();
				suma += a[i];
			}
			for(int i=0;i<n;i++) {
				b[i] = sc.nextLong();
				sumb += b[i];
			}
			
			if(suma<sumb) {
				System.out.println(-1);
				return;
			}
			
			long ret = 0;
			
			for(int i=0;i<n;i++) {
				if(a[i]<b[i]) {
					minus += b[i]-a[i];
					ret++;
				}else {
					list.add((a[i]-b[i]));
				}
			}
			
			if(list.size()==n) {
				System.out.println(0);
				return;
			}
			
			
			Collections.sort(list, Collections.reverseOrder());
			
			for(int i=0;i<n;i++) {
				ret++;
				if(list.get(i)>=minus) {
					break;
				}
				minus -= list.get(i);
			}
			
			System.out.println(ret);
	    }
		
	}
	
