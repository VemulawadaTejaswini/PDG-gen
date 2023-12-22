import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();


		Map<String,Long> map = new TreeMap<>();
		long cnt = 0;
		
		for(int i = 0; i < n; i++) {
			String s = stdIn.next();
			if(map.containsKey(s)) {
				map.put(s,map.get(s)+1);
				if(cnt < map.get(s)) {
					cnt = map.get(s);
				}
			}else {
				map.put(s,(long)1);
				if(cnt==0) {
					cnt=1;
				}
			}
		}

		for(String s: map.keySet()) {
			if(map.get(s)==cnt) {
				System.out.println(s);
			}
		}


	}

}
