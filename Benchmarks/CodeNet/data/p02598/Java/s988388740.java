

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
	
		int []a = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(a);
		
		int l = 0;
		int r = a[n-1];
		int mid = (r + l)/2;
		
		while(r - l > 1) {
			int cnt = 0;
			mid = (l + r)/2;
			for(int i = 0 ; i < n ;i++) {
				cnt += Math.ceil((double)a[i]/mid)-1;
			}
			
			if(cnt > k) {
				l = mid;
			}
			else if(cnt <= k) {
				r = mid;
			}
		}
		
		System.out.println(r);
		
	
	}

}
