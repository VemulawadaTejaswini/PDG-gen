import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int N = sc.nextInt();
		int result = 0;

		while (sc.hasNextInt()) {
			list.add(sc.nextInt());
		}
		Collections.sort(list, Collections.reverseOrder());
		
		int sign = 1;
		for (int tmp : list) {
			result += tmp * sign;
			sign *= -1;
		}
		
		System.out.println(result);
	}
}
