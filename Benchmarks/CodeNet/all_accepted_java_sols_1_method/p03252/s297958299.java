import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();


		HashMap<Character, Integer> sMap = new HashMap<>();
		HashMap<Character, Integer> tMap = new HashMap<>();

		for (int i = 0; i < S.length; i++) {
			if (sMap.containsKey(S[i])) {
				sMap.put(S[i], sMap.get(S[i]) + 1);
			} else {
				sMap.put(S[i], 0);
			}
			if (tMap.containsKey(T[i])) {
				tMap.put(T[i], tMap.get(T[i]) + 1);
			} else {
				tMap.put(T[i], 0);
			}
		}

		int[] sCnt = new int[S.length];
		int[] tCnt = new int[T.length];
		for (int i = 0; i < S.length; i++) {
			if (sMap.containsKey(S[i])) {
				sCnt[i] = sMap.get(S[i]);
			}
			if (tMap.containsKey(T[i])) {
				tCnt[i] = tMap.get(T[i]);
			}
		}

		for (int i = 0; i < tCnt.length; i++) {
			if (sCnt[i] != tCnt[i]) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}
