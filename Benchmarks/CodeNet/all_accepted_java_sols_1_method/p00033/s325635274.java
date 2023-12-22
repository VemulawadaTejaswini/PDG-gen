import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			String[] dataset = str.split(" ");
			int[] balls = new int[10];
			List<Integer> A = new ArrayList<>();
			List<Integer> B = new ArrayList<>();
			int cntA = 0;
			int cntB = 0;
			B.add(0);
			boolean isAble = true;
			for (int j = 0; j < 10; j++) {
				balls[j] = Integer.parseInt(dataset[j]);
				if (j == 0)
					A.add(balls[j]);
				else {
					if (balls[j] < A.get(cntA) && balls[j] < B.get(cntB)) {
						isAble = false;
						break;
					} else if (balls[j] < A.get(cntA) && balls[j] > B.get(cntB)) {
						B.add(balls[j]);
						cntB++;
					} else if (balls[j] > A.get(cntA) && balls[j] < B.get(cntB)) {
						A.add(balls[j]);
						cntA++;
					} else {
						if (A.get(cntA) > B.get(cntB)) {
							A.add(balls[j]);
							cntA++;
						} else {
							B.add(balls[j]);
							cntB++;
						}
					}
				}
			}
			if (isAble)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}