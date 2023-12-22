import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < 3; i++) {
			int tmp = sc.nextInt();
			list.add(tmp);
		}

		if(isPoor(list)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static boolean isPoor(List<Integer> list) {
		list.sort(null);

		int A = list.get(0);
		int B = list.get(1);
		int C = list.get(2);

		if(A == B) {
			if(B != C) {
				return true;
			}
		} else {
			if(B == C) {
				return true;
			}
		}
		return false;
	}

}
