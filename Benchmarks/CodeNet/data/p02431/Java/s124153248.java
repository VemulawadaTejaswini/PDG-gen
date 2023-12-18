import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    int type = sc.nextInt();
		    if (type == 0) {
		        list.add(sc.nextInt());
		    } else if (type == 1) {
		        sb.append(list.get(sc.nextInt())).append("\n");
		    } else {
		        list.remove(list.size() - 1);
		    }
		}
		System.out.print(sb);
	}
}

