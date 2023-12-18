
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();

		int[][] ab = new int[n][];
		for (int i = 0; i < n; i++) {
			ab[i] = new int[n];
			for (int j = 0; j < n; j++) {
				ab[i][j] = -1;
			}
		}

		for (int i = 0; i < m; i++) {
			int mi = sc.nextInt() - 1;
			int ni = sc.nextInt() - 1;
			ab[mi][ni] = 100001;
			ab[ni][mi] = 100001;
		}

		Stack<Integer> cost = new Stack<>();
		Stack<Integer> room = new Stack<>();

		cost.push(1);
		room.push(0);

		while (!room.empty()) {
			int current_cost = cost.pop();
			int current_room = room.pop();

			//System.out.println(current_cost);
			//System.out.println(current_room);
			for (int i = 0; i < n; i++) {
				//System.out.println(">" + ab[current_room][i]);
				if (0 < ab[current_room][i] && ab[current_room][i] > current_cost) {

					ab[current_room][i] = ab[i][current_room] = current_cost;
					if (i > 0) {
						room.push(i);
						cost.push(current_cost + 1);
					}
				}
			}
		}
		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print(ab[i][j] + " ");
//			}System.out.print("\n");
//	
//		}

		boolean death_flag = false;
		String result = "";
		for (int i = 1; i < n; i++) {
			int min_idx = -1;
			int min_cost = 100001;
			for (int j = 0; j < n; j++) {
				if (ab[i][j] == 100001) {
					death_flag = true;
					break;
				}

				if (ab[i][j] > 0 && ab[i][j] < min_cost) {
					min_cost = ab[i][j];
					min_idx = j;
				}
			}
			if (death_flag) {
				break;
			}
			result += (min_idx+1) + "\r\n";
		}

		if (death_flag) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
			System.out.println(result);
		}
	}

}
