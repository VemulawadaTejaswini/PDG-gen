import java.util.*;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);

		for (int i = 0; i < K; i++) {
			int a = list.removeLast();
			int j = 2;
			//System.out.println(a);
			for (;i < K-1; j++) {
				if (a/j < list.getLast() || a/(j+1) > list.getLast()) {
					break;
				}
				i++;
			}
			int aa = a;
			for (int k = 0; k < j-1; k++) {
				list.add(a/j);
				aa -= a/j;
			}
			list.add(aa);
			Collections.sort(list);
		}
		System.out.println(list.getLast());
	}
}