import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int pi = sc.nextInt();
			list.add(pi);
		}
		Collections.sort(list);
		long count = 0;
		for (int i = 0; i < K; i++) {
			count += list.get(i);
		}
		System.out.println(count);
	}
}