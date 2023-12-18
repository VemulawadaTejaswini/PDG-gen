import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long co = 0;
		HashMap<String, Long> l = new HashMap<String, Long>();
		for (int i = 0; i < N; i++) {
			char[] c = sc.next().toCharArray();
			Arrays.sort(c);
			String S = new String(c);
			if (l.containsKey(S)) {
				l.put(S, l.get(S) + 1);
				co += l.get(S);
			} else {
				l.put(S, (long) 0);
			}
		}
		sc.close();
		System.out.println(co);
	}

}