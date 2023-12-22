import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String S[] = new String[N];
		ArrayList<String>ans = new ArrayList<String>();

		for (int i=0; i<N; i++){
			S[i] = sc.next();
		}
		Arrays.sort(S);
		int maxCnt=0;
		HashMap<String, Integer>map = new HashMap<String, Integer>();
		for (int i=0; i<N; i++){
			if (map.containsKey(S[i])){
				map.put(S[i], map.get(S[i]) + 1);
			} else {
				map.put(S[i], 1);
			}
			maxCnt = Math.max(maxCnt, map.get(S[i]));
		}
		for (String key : map.keySet()){
			if (map.get(key) == maxCnt){
				ans.add(key);
			}
		}
		Collections.sort(ans);
		for (int i=0; i<ans.size(); i++){
			System.out.println(ans.get(i));
		}
	}
}