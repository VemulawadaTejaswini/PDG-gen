import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		List<Integer> list = new ArrayList<>();
		List<Integer> subList = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			list.add(scan.nextInt());
			subList.add(list.get(i));
		}

		Collections.sort(subList);

		for(int i = 0; i < N; i++) {

			// A1がAmaxと等しい
			if(subList.get(N -1) == list.get(i)) {
				// 2番目に大きい値
				System.out.println(subList.get(N -2));
			}else {
				System.out.println(subList.get(N - 1));
			}

		}
	}
}