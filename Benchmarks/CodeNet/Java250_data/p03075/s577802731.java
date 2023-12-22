import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Map<Character, List<Integer>> charIndexMap = new HashMap<Character, List<Integer>>();
		Map<Integer, Integer> golemMap = new HashMap<Integer, Integer>();

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();

		if (e-a > k) {

			System.out.println(":(");
			return;
		}


		System.out.println("Yay!");
	}

}