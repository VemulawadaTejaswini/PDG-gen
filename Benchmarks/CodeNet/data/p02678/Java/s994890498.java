import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static List<Set<Integer>> setList = new ArrayList<>();
	static boolean resBool;
	static Integer[] res;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		for (int i = 0; i <= N; i++) {
			Set<Integer> set = new HashSet<>();
			setList.add(set);
		}
		for (int i = 0; i < M; i++) {
			int tmp1 = sc.nextInt();
			int tmp2 = sc.nextInt();
			setList.get(tmp1).add(tmp2);
			setList.get(tmp2).add(tmp1);
		}
		resBool = true;
		res = new Integer[N + 1];
		res[0] = 99;
		res[1] = 99;
		getRes(new ArrayList<>(Arrays.asList(1)));

		if (resBool) {
			System.out.println("Yes");
			for (int i = 2; i <= N; i++) {
				System.out.println(res[i]);
			}
		} else {
			System.out.println("No");
		}
	}

	private static void getRes(List<Integer> array) {
		List<Integer> dist = new ArrayList<>();
		for (int i : array) {
			for (int j : setList.get(i)) {
				if (res[j] == null) {
					dist.add(j);
					res[j] = i;
				}
			}
		}
		if (!Arrays.asList(res).contains(null)) {
			return;
		}
		if (dist.isEmpty()) {
			resBool = false;
			return;
		}
		getRes(dist);
	}
}