import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] heights = new int[n];
		for (int i = 0; i < n; i++) {
		    heights[i] = sc.nextInt();
		}
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    graph.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    graph.get(a).add(b);
		    graph.get(b).add(a);
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
		    boolean flag = true;
		    for (int x : graph.get(i)) {
		        if (heights[i] <= heights[x]) {
		            flag = false;
		            break;
		        }
		    }
		    if (flag) {
		        count++;
		    }
		}
		System.out.println(count);
	}
}
