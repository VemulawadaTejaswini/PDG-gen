import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Map<Integer, Boolean> A = new TreeMap<Integer, Boolean>();
		boolean ans = true;
      	int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			if (!A.containsKey(temp)) {
				A.put(temp, true);
			} else {
				ans = false;
				break;
			}
		}
		System.out.println(ans ? "YES" : "NO");
	}
}