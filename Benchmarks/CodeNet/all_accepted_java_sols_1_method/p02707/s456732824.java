import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> m = new HashMap<>();
		for(int i = 1; i <= N; i++)
			m.put(i, 0);
		for(int i = 1; i < N; i++) {
			int A = sc.nextInt();
			m.put(A, m.get(A)+1);
		}
		for(int i = 1; i <= N; i++)
			System.out.println(m.get(i));
	}

}