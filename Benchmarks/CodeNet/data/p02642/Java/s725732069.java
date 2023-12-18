
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		int []b = new int [10000000];
		
		List<Integer> L = new ArrayList<Integer>();

		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			L.add(a[i]);
			b[a[i]]++;

		}
		Collections.sort(L);
		int cnt = n;
		for(int i = n-1 ; i >= 0 ;i--) {
			boolean jdg = true;
			for(int j = 1 ; j * j <= a[i] ; j++) {
				if(a[i] % j == 0) {
					if(L.contains(j)) {
						cnt--;
						break;
					}
					if(j != 1 &&L.contains(a[i]/j)) {
						cnt--;
						break;
					}
				}
			}
		}
		
		for(int num : L) {
			if(b[num] > 1) {
				cnt--;
			}
		}
		
		System.out.println(cnt);
		
	}
	
}
