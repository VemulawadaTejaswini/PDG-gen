import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		HashMap<String, Long>map = new HashMap<String, Long>();

		for (int i=0; i<N; i++){
			String input = sc.next();
			char[] charInput = input.toCharArray();
			String sorted;
			Arrays.sort(charInput);
			sorted = String.valueOf(charInput);
			if (map.containsKey(sorted)){
				map.put(sorted, map.get(sorted)+1);
			} else {
				map.put(sorted, 1L);
			}
		}
		long ans = 0;
		for (long cnt : map.values()){
			ans += combination(cnt);
		}
		System.out.println(ans);
	}

	public static long combination(long cnt){
		long ret = 0;
		for (long i=1; i<=cnt-1; i++){
			ret += i;
		}
		return ret;
	}
}