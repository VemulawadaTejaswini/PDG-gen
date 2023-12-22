import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(), i;
		HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
		long sum = 0;
		for (i = 0; i < N; i++) {
			int temp = sc.nextInt();
			sum += temp;
			if (a.containsKey(temp)) {
				a.put(temp, a.get(temp) + 1);
			} else {
				a.put(temp, 1);
			}
		}
		int Q = sc.nextInt();
		for (i = 0; i < Q; i++) {
			int B = sc.nextInt(), C = sc.nextInt();
			if (a.containsKey(B)) {
				sum = sum + (C - B) * (a.get(B));
				if (a.containsKey(C)) {
					a.put(C, a.get(C) + a.get(B));
				} else {
					a.put(C, a.get(B));
				}
				a.put(B, 0);
			}
			System.out.println(sum);
		}
	}
}