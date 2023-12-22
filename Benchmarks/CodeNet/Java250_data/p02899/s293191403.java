import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 1; i <= N; i++) {
			int A = scanner.nextInt();
			hashMap.put(A, i);
			arrayList.add(A);
		}

		Collections.sort(arrayList);

		for (int i = 0; i < N; i++) {
			System.out.print(hashMap.get(arrayList.get(i)) + " ");
		}

	}
}