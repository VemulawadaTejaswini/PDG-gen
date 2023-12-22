import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 135
//B	0 or 1 Swap
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt((sc.next()));
		List<Integer> pList = new ArrayList<>();
		List<Integer> sList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int p = sc.nextInt();
			pList.add(p);
			sList.add(p);
		}
		sc.close();

		Collections.sort(sList);

		int differ = 0;
		for (int i = 0; i < N; i++) {
			if (pList.get(i) != sList.get(i)) {
				differ++;
			}
		}

		if (differ == 0 || differ == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
