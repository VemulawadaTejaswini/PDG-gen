import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		HashMap<String, Integer> cost = new HashMap<String, Integer>();
		String alc[];
		ArrayList<String> list[];
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			for (int i = 0; i < n; i++) {
				cost.put(sc.next(), sc.nextInt());
			}
			m = sc.nextInt();
			alc = new String[m];
			list = new ArrayList[m];
			for (int i = 0; i < m; i++) {
				alc[i] = sc.next();
				int k = sc.nextInt();
				list[i] = new ArrayList<String>();
				while (k-- != 0) {
					list[i].add(sc.next());
				}
			}
			
			boolean flag = true;
			while (flag) {
				flag = false;
				for (int i = 0; i < m; i++) {
					int ncost = 0;
					for (int j = 0; j < list[i].size(); j++) {
						ncost += cost.get(list[i].get(j));
					}
					if (ncost < cost.get(alc[i])) {
						cost.put(alc[i], ncost);
						flag = true;
					}
				}
			}
			System.out.println(cost.get(sc.next()));
		}
	}
}