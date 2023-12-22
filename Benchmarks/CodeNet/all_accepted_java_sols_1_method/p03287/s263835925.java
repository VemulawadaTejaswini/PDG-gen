import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Long ,Integer> hm = new HashMap<Long,Integer>();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int []a = new int [n];
		
		for(int i = 0 ;i < n ;i++) {
			a[i] = sc.nextInt();
		}
		
		long sum = 0;
		long ans = 0;
		
		hm.put(0L,1);
		
		for(int i = 0 ; i < n ;i++) {
			sum += a[i];
			sum %= m;
			
			ans += hm.getOrDefault(sum, 0);
			hm.put(sum, hm.getOrDefault(sum, 0)+1);
		}
		
		System.out.println(ans);
	}	
}