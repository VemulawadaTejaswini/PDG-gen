import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		ArrayList<Integer> ans = new ArrayList<>();

		if(k * 2 > b - a) {
			for(int i = a; i <= b; i++) {
				ans.add(i);
			}
		}else {
			for(int i = a; i < a + k; i++) {
				ans.add(i);
			}
			for(int i = b - k + 1; i <= b; i++) {
				ans.add(i);
			}
		}

		int s = ans.size();
		// 出力
		for(int i = 0; i < s; i++) {
			System.out.println(ans.get(i));
		}
	}

}
