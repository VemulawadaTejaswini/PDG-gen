import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
      
		int X = sc.nextInt();
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());

		}
		for (int i = 0; true; i++) {
			if (!list.contains(X - i)) {
				System.out.println(X - i);
				break;
			} else if (!list.contains(X + i)) {
				System.out.println(X + i);
				break;
			}
		}
	}
}