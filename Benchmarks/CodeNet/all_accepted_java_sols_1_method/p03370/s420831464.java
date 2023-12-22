import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		for(int i = 0; i< N; i++) {
			list.add(Integer.parseInt(sc.next()));
			sum += list.get(i);
		}
		sc.close();

		//リストを昇順にソート
		Collections.sort(list);

		int plus = (X - sum) / list.get(0);
		int ans = N + plus;
		System.out.println(ans);

	}

}