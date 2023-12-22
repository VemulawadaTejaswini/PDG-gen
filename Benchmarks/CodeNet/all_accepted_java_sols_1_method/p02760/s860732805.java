import java.util.*;

public class Main {

	public static void main(String[] args) {

		Map<Integer, Integer> ele = new HashMap<Integer, Integer>();
		Set<Integer> idx = new HashSet<Integer>();
		int[][] bingo = {{0, 1, 2},{3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
		boolean bf = false;

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 9; i++) {
			ele.put(sc.nextInt(), i);
		}

		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(ele.containsKey(num)) idx.add(ele.get(num));
		}

		for(int[] ns : bingo) {
			for(int i = 0; i < ns.length; i++) {
				if(!idx.contains(ns[i])) break;
				if(i == 2) bf = true;
			}
			if(bf) break;
		}

		System.out.println(bf ? "Yes" : "No");
	}
}