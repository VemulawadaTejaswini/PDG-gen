import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		HashMap<String, Integer> cnt = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			String s = sorted(in.next());
			cnt.put(s, cnt.getOrDefault(s, 0) + 1);
		}
		
		long ans = 0;
		for (String s : cnt.keySet()) {
			ans += nc2(cnt.get(s));
		}
		
		System.out.println(ans);
	}
	
	private static long nc2(long x) {
		return (x * (x - 1)) >> 1;
	}
	
	private static String sorted(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}