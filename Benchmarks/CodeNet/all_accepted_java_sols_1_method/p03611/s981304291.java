
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i=0; i<N; i++) {
			int temp = sc.nextInt();
			if(m.containsKey(temp)) {
				m.put(temp, m.get(temp) + 1);
			} else {
				m.put(temp, 1);
			}
		}
		sc.close();
		int ans = 0;
		for(Map.Entry<Integer, Integer> entry : m.entrySet()) {
			int minusone = 0;
			int plusone = 0;
			if(m.containsKey(entry.getKey()-1)) {
				minusone = m.get(entry.getKey()-1);
			}
			if(m.containsKey(entry.getKey()+1)) {
				plusone = m.get(entry.getKey()+1);
			}
			if(ans < minusone + plusone + entry.getValue()) {
				ans = minusone + plusone + entry.getValue();
			}
		}
		System.out.println(ans);
	}

}
