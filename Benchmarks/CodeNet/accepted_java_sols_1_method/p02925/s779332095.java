import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayDeque<Integer>> matrix = new ArrayList<>();
		ArrayDeque<Integer> deq = new ArrayDeque<>();
		ArrayDeque<Integer> next = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
		    ArrayDeque<Integer> tmp = new ArrayDeque<>();
		    for (int j = 0; j < n - 1; j++) {
		        tmp.add(sc.nextInt() - 1);
		    }
		    matrix.add(tmp);
		    deq.add(i);
		}
		int times = 0;
		while (deq.size() > 0) {
		    times++;
		    boolean[] used = new boolean[n];
		    while(deq.size() > 0) {
		        int x = deq.poll();
		        if (!used[x] && matrix.get(x).size() > 0) {
		            int y = matrix.get(x).peek();
		            if (!used[y] && matrix.get(y).peek() == x) {
		                next.add(x);
		                next.add(y);
		                used[x] = true;
		                used[y] = true;
		                matrix.get(x).poll();
		                matrix.get(y).poll();
		            }
		        }
		    }
		    ArrayDeque<Integer> tmp = next;
		    next = deq;
		    deq = tmp;
		}
        int count = 0;
        for (ArrayDeque tmp : matrix) {
            count += tmp.size();
        }
        if (count > 0) {
            System.out.println(-1);
            return;
        }
		System.out.println(times - 1);
   }
}
