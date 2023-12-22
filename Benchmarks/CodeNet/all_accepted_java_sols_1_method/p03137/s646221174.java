import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 117
//C	Streamline
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		if (N >= M) {
			System.out.println(0);
			sc.close();
			return;
		}

		List<Integer> inList = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			inList.add(sc.nextInt());
		}
		sc.close();


		Collections.sort(inList);

		List<Integer> diffList = new ArrayList<>();
		if (inList.size() > 1) {
			for (int i = 0; i < inList.size(); i++) {
				diffList.add(inList.get(i + 1) - inList.get(i));
				if (i == inList.size() - 2) {
					break;
				}
			}
		}

		Collections.sort(diffList);

		for (int i = 0; i < N - 1; i++) {
			if (diffList.size() < 2) {
				break;
			}
			diffList.remove(diffList.size() - 1);
		}

		int sum = 0;
		for (Integer d : diffList) {
			sum += d;
		}

		System.out.println(sum);

	}
}
