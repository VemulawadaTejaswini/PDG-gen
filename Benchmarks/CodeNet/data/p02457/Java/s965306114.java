import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    int type = sc.nextInt();
		    int x = sc.nextInt();
		    if (type == 0) {
		        set.add(x);
		        sb.append(set.size()).append("\n");
		    } else if (type == 1) {
		        if (set.contains(x)) {
		            sb.append(1);
		        } else {
		            sb.append(0);
		        }
		        sb.append("\n");
		    } else if (type == 2) {
		        set.remove(x);
		    } else {
		        int y = sc.nextInt();
		        Integer tmp = x - 1;
		        while ((tmp = set.higher(tmp)) != null && tmp <= y) {
		            sb.append(tmp).append("\n");
		        }
		    }
		}
		System.out.print(sb);
	}
}

