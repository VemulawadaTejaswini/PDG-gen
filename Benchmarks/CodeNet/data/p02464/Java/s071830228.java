import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Set<Integer> setA = new TreeSet<>();
		Set<Integer> setB = new TreeSet<>();

		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			setA.add(sc.nextInt());
		}

		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			setB.add(sc.nextInt());
		}


		setA.retainAll(setB);

		for(int value : setA) {
			System.out.println(value);
		}
	}

}

