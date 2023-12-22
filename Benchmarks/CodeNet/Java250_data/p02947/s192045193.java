import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		HashMap<String, Integer> anagCount = new HashMap<>();
		for(int i=0; i<N; i++) {
			String s = in.next();
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);
			if(anagCount.containsKey(sorted)) {
				anagCount.put(sorted, anagCount.get(sorted)+1);
			}else {
				anagCount.put(sorted, 1);
			}
		}
		
		long ans = 0;
		for (int count : anagCount.values()) {
			ans += ((long)count)*(count-1)/2;
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
