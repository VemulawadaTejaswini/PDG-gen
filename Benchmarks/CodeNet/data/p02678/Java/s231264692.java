import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Integer> listA;
	static List<Integer> listB;
	static boolean resBool;
	static Integer[] res;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		listA = new ArrayList<>();
		listB = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			listA.add(sc.nextInt());
			listB.add(sc.nextInt());
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
			for (int j = 0; j < listA.size(); j++) {
				if (i == listA.get(j)) {
					if (res[listB.get(j)] == null) {
						dist.add(listB.get(j));
						res[listB.get(j)] = i;
					}
				}
			}
			for (int j = 0; j < listB.size(); j++) {
				if (i == listB.get(j)) {
					if (res[listA.get(j)] == null) {
						dist.add(listA.get(j));
						res[listA.get(j)] = i;
					}
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