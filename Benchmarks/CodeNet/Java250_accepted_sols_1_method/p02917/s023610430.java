import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < N - 1; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		int ans = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			ans += Math.min(list.get(i - 1), list.get(i));
		}
		ans += list.get(N - 2);

		System.out.println(ans);
	}

}