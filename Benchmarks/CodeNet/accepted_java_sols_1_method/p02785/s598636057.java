import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
	
		Long [] m = new Long[n];

		for (int i = 0 ; i < n ; i++) {
			m[i] = Long.parseLong(sc.next());
		}
		
        Arrays.sort(m, Collections.reverseOrder());

		Long ans = 0l;
		
		if(n <= k) {
	
		}else {
			for (int i = k ; i < n ; i++) {
				ans += m[i]; 
			}
			
		}
		
		
		System.out.println(ans);
	}
	
	
	

}