import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] S = new String[N];
		int[] P = new int[N];
		String[] T = new String[N];
		
		for(int i = 0; i < N; i++) {
			S[i] = sc.next();
			P[i] = sc.nextInt();
			T[i] = S[i];
		}
		
		Arrays.sort(T);
		Map<Integer, Integer> x = new TreeMap<>(Collections.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			if(i == 0 || !T[i].equals(T[i - 1])) {
				for(int j = 0; j < N; j++) {
					if(T[i].equals(S[j])) {
						x.put(P[j], j);
					}
				}
				for(Integer k : x.values()) {
					System.out.println(k + 1);
				}
			}
			x.clear();
		}
	}
}
