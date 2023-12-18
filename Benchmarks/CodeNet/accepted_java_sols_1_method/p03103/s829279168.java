import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); //軒数
		
		int m = stdIn.nextInt(); //買う本数
		
		
		Map <Long, Long> map = new TreeMap<>();
		
		for(int i = 0; i < n; i++) {
			long a = stdIn.nextLong(); //値段
			long b = stdIn.nextLong(); //本数
			
			if(!map.containsKey(a)) {
				map.put(a, b);
			}else {
				map.put(a, map.get(a)+b);
			}
			
		}
		
		long ans = 0;
		
		for(long s: map.keySet()) {
			
			if(m <= map.get(s)) {
				ans += s * m;
				break;
			}else {
				ans += s * map.get(s);
				m -= map.get(s);
			}
			
			
			
		}
		
		System.out.println(ans);
		
	}

}
