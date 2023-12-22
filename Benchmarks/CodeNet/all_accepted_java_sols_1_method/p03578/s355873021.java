import java.util.*;

// DDCC 2017-D
// http://ddcc2017-qual.contest.atcoder.jp/tasks/ddcc2017_qual_d	

public class Main {

	public static void main (String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		HashMap<Integer, Integer> problems = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int diff = in.nextInt();
			
			if (problems.containsKey(diff)) {
				problems.put(diff, 1 + problems.get(diff));
			} else {
				problems.put(diff, 1);
			}
		}
		
		int M = in.nextInt();
		boolean canCreate = true;
		for (int i = 0; i < M && canCreate; i++) {
			int diff = in.nextInt();
			
			if (!problems.containsKey(diff) || problems.get(diff) == 0) {
				canCreate = false;
			} else {
				problems.put(diff, problems.get(diff) - 1);
			}
		}
		System.out.println(canCreate ? "YES" : "NO");
	}
}
