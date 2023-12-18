import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static int number[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> array = new ArrayList<String>();

		try {
			String str = null;
			while ((str = br.readLine()) != null) {
				array.add(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		for (String s : array) {
			String[] data = s.split(" ");
			int N = Integer.parseInt(data[0]);
			int ans = Integer.parseInt(data[1]);

			int count = checkAnswer(N, ans);

			System.out.println(count);
		}
	}

	private static int checkAnswer(int N, int ans) {
		Queue<P> que = new LinkedList<P>();

		for (int i = 0; i < number.length; i++) {
			P p = new P();
			p.useNum = number.clone();
			p.index = i;
			p.count = 1;
			p.sum = p.useNum[i];
			p.useNum[i] = -1;

			if (p.sum <= ans)
				que.offer(p);
		}

		int answerCount = 0;
		while (!que.isEmpty()) {

			P pf = que.poll();
			if (pf.count == N && pf.sum == ans) {
				answerCount++;
			}
			for (int i = 0; i < number.length; i++) {
				if (pf.useNum[i] != -1) {
					P pa = new P();
					pa.useNum = pf.useNum.clone();
					pa.index = i;
					pa.count = pf.count + 1;
					pa.sum = pf.sum + (pf.useNum[i] * pa.count);
					pa.useNum[i] = -1;
					if (pa.count <= N && pa.sum <= ans) {
						que.offer(pa);
					} else {
						break;
					}
				}
			}
		}
		return answerCount;
	}

}

class P {
	int index;
	int count;
	int sum;
	int[] useNum;
}