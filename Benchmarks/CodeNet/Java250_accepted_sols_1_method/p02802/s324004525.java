
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		Map<Integer, Integer> m2 = new HashMap<Integer, Integer>();

		int cnt = 0;

		sc.nextLine();
		String tmp = "";
		int no = 0;
		String AC = "";
		for (int i = 0; i < M; i++) {
			tmp = sc.nextLine();
			no = Integer.parseInt(tmp.split(" ")[0]);
			AC = tmp.split(" ")[1];

			if (m.get(no) == null) {
				if (AC.equals("AC")) {
					m.put(no, 1);
					m2.put(no, 0);
				} else {
					m.put(no, 0);
					m2.put(no, 1);
				}
			} else {
				if (AC.equals("AC") && m.get(no) != 1) {
					m.put(no, 1);
				} else if (AC.equals("WA") && m.get(no) == 0) {
					m2.put(no, m2.get(no) + 1);
				}
			}
		}

		int ansCnt = 0;
		int wacnt = 0;
		for (int key : m.keySet()) {
			if (m.get(key) == 1) {
				ansCnt++;
				wacnt += m2.get(key);
			}
		}

		System.out.println(ansCnt + " " + wacnt);

	}
}
