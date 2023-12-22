import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Map<Integer,Integer> map = new HashMap<>();
	static Set<Integer> set = new HashSet<>();
	static int count = 0;
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			map.put(i + 1, sc.nextInt());
		}
		solve(1);
	}
	static void solve(int i) {
		if(i == 2) {
			System.out.println(count);
			return;
		} else if(set.contains(i)){
			System.out.println(-1);
			return;
		}
		set.add(i);
		count++;
		int next = map.get(i);
		solve(next);
	}
}