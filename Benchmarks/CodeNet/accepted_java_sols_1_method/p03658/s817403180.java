import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i< N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//リストを降順にソート
		Collections.sort(list, Collections.reverseOrder());
		int sum = 0;
		for(int i = 0; i< K; i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
	}

}