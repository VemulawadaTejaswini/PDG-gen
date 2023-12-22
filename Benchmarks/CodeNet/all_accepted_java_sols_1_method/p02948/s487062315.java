import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int idx;
		int A, B;
		ArrayList<Integer> bList;
		HashMap<Integer, ArrayList<Integer>> bMap = new HashMap<Integer, ArrayList<Integer>>();
		for (idx = 0; idx < N; idx++) {
			A = Integer.parseInt(sc.next());
			B = Integer.parseInt(sc.next());
			bList = bMap.get(A);
			if (bList == null) {
				bList = new ArrayList<Integer>();
				bMap.put(A, bList);
			}
			bList.add(B);
		}

		int maxval;
		long sum = 0;
		ArrayList<Integer> valList = new ArrayList<Integer>();
		for (idx = 1; idx <= M; idx++) {
			// idx日目のリスト追加してソートする
			bList = bMap.get(idx);
			if (bList != null) {
				valList.addAll(bMap.get(idx));
				Collections.sort(valList);
			}
			if (valList.size() > 0) {
				maxval = valList.remove(valList.size() - 1);
				sum += maxval;
			}

		}

		System.out.println(sum);

	}

}
