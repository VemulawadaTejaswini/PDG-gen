import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		ArrayList<Integer> ans = new ArrayList<>();
		while (list.size() > 0) {
			boolean flag = false;
			for (int i = 0; i < list.size(); i++) {
				int x = list.get(list.size() - 1 - i);
				if (x == list.size() - i) {
					flag = true;
					ans.add(x);
					list.remove(list.size() - 1 - i);
					break;
				}
			}
			if (!flag) {
				System.out.println(-1);
				return;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ans.size(); i++) {
			sb.append(ans.get(ans.size() - 1 - i)).append("\n");
		}
		System.out.print(sb);
	}
}
