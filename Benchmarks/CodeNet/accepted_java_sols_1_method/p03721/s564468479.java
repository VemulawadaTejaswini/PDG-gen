import java.util.*;

// ABC 27-C
// http://abc027.contest.atcoder.jp/tasks/abc027_c
 
public class Main {
	
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		long k = in.nextLong();
		
		long[] counts = new long[100001];
		
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			long b = in.nextLong();
			
			counts[a] += b;
		}
		
		int answer = 0;
		long counter = 0;
		while (counter < k) {
			counter += counts[answer];
			answer++;
		}
		
		System.out.println(answer - 1);
		
//		HashMap<Integer, Long> count = new HashMap<Integer, Long>();
//		ArrayList<Integer> keys = new ArrayList<Integer>();
//		
//		for (int i = 0; i < n; i++) {
//			int a = in.nextInt();
//			long b = in.nextLong();
//			
//			if (keys.indexOf(a) >= 0) {
//				b += count.get(a);
//			} else {
//				keys.add(a);
//			}
//			count.put(a, b);
//		}
//		
//		
//		keys.sort(null);
//		
//		int index = 0;
//		long counter = 0;
//		
//		while (true) {
//			counter += count.get(keys.get(index));
//			if (counter < k) {
//				index++;
//			} else {
//				break;
//			}
//		}
//		
//		System.out.println(keys.get(index));
	}
}