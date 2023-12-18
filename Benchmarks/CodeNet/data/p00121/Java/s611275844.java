import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static final int MAX_NUM = 76543210;
	boolean[] ans;
	char[] pazzle;

	void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			ans = new boolean[MAX_NUM + 1];
			pazzle = new char[8];
			for (int i = 0; i < 8; i++)
				pazzle[i] = (char)scan.nextInt();
			Queue<char[]> que = new LinkedList<char[]>();
			que.add(pazzle);
			bfs(que);
		}
	}

	void bfs(Queue<char[]> que) {
		int sum = 0;
		while (!que.isEmpty()) {
			int size = que.size();
			for (int i = 0; i < size; i++) {
				char[] p = que.poll();
				int num = convertArrayToNumber(p);
				if (num == 1234567) {
					System.out.println(sum);
					return;
				}
				int index = getZeroOfIndex(p);
				int[] d = { -4, -1, 1, 4 };
				for (int j = 0; j < d.length; j++) {
					if (index == 4 && d[j] == -1)
						continue;
					if (index == 3 && d[j] == 1)
						continue;
					int ni = index + d[j];
					if (ni < 0 || ni >= 8)
						continue;
					char[] np = p.clone();
					swap(np, ni, index);
					int n = convertArrayToNumber(np);
					if (ans[n])
						continue;
					ans[n] = true;
					que.add(np);
				}
			}
			sum++;
		}
	}

	void swap(char[] array, int a, int b) {
		char tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

	int convertArrayToNumber(char[] array) {
		int sum = 0;
		for (int i = 1; i <= 8; i++) {
			sum += (int)(array[i - 1]) * Math.pow(10, 8 - i);
		}
		return sum;
	}

	int getZeroOfIndex(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}