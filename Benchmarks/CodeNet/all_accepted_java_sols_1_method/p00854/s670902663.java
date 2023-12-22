import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && k == 0 && m == 0)
				break;
			List<Integer> stones = new ArrayList<Integer>(0);
			for (int i = 1; i < n + 1; i++)
				stones.add(i);
			int pointer = m - 1;
			stones.remove(pointer);
			while (!(stones.size() == 1)) {
				pointer = (pointer + k - 1) % stones.size();
				stones.remove(pointer);
			}
			System.out.println(stones.get(0));
		}
		sc.close();
	}
}