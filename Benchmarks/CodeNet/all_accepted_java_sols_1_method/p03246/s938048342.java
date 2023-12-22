import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> oddMap = new HashMap<>();
		HashMap<Integer, Integer> evMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (i % 2 == 0) {
				int count = 1;
				if (evMap.containsKey(x)) {
					count = evMap.get(x) + 1;
				}
				evMap.put(x, count);
			} else {
				int count = 1;
				if (oddMap.containsKey(x)) {
					count = oddMap.get(x) + 1;
				}
				oddMap.put(x, count);
			}
		}
		int oddMax = 0;
		int oddMaxNum = 0;
		int oddNext = 0;
		int oddNextNum = 0;
		for (int x : oddMap.keySet()) {
			int count = oddMap.get(x);
			if (oddMax < count) {
				oddNext = oddMax;
				oddNextNum = oddMaxNum;
				oddMax = count;
				oddMaxNum = x;
			} else if (oddNext < count) {
				oddNext = count;
				oddNextNum = x;
			}
		}
		int evMax = 0;
		int evMaxNum = 0;
		int evNext = 0;
		int evNextNum = 0;
		for (int x : evMap.keySet()) {
			int count = evMap.get(x);
			if (evMax < count) {
				evNext = evMax;
				evNextNum = evMaxNum;
				evMax = count;
				evMaxNum = x;
			} else if (evNext < count) {
				evNext = count;
				evNextNum = x;
			}
		}
		int ans;
		if (oddMaxNum == evMaxNum) {
			ans = n - Math.max(oddMax + evNext, oddNext + evMax);
		} else {
			ans = n - oddMax - evMax;
		}
		System.out.println(ans);
	}
}
