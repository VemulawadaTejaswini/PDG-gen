import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		
		Map<Integer,Long> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {

				
				if(!map.containsKey(a[i])) {
					map.put(a[i],(long)0);
				}
				map.put(a[i],map.get(a[i])+1);
		}
			
		long cnt = 0;
		for(Integer k: map.keySet()) {
			cnt += (map.get(k)*(map.get(k)-1))/2;
		}

		for(int i = 0; i < n; i++) {
			long tmp = map.get(a[i]);
			
			System.out.println(cnt - (tmp -1));
		}
		

	

	}

}
