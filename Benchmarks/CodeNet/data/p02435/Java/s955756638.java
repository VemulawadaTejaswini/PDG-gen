import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayDeque<Integer>> lists = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    lists.add(new ArrayDeque<>());
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
		    int type = sc.nextInt();
		    if (type == 0) {
		        lists.get(sc.nextInt()).push(sc.nextInt());
		    } else if (type == 1) {
		        int idx = sc.nextInt();
		        if (lists.get(idx).size() > 0) {
		            sb.append(lists.get(idx).peek()).append("\n");
		        }
		    } else {
		        int idx = sc.nextInt();
		        if (lists.get(idx).size() > 0) {
		            lists.get(idx).pop();
		        }
		    }
		}
		System.out.print(sb);
	}
}

