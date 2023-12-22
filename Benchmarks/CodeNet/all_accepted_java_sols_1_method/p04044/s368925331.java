import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//入力
		int N = sc.nextInt();
		int L = sc.nextInt();

		List<String> SArray = new ArrayList<String>();

		for (int i = 0; i < N; i++) {
			String S = sc.next();
			SArray.add(S);
		}

		Collections.sort(SArray);

		for (int i = 0; i < N; i++) {
		System.out.print(SArray.get(i));
		}
	}
}