import java.util.*;

// ABC 62-D
// http://abc062.contest.atcoder.jp/tasks/arc074_b

public class Main {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			
			int count = 0;
			if (map.containsKey(num)) {
				count = map.get(num);
			}
			
			map.put(num, count + 1);
		}
		
		int answer = 0;
		for (int num : map.keySet()) {
			if (map.get(num) % 2 == 1) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
