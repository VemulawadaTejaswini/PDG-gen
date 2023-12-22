import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();
		List<Integer> kukuList = new ArrayList<>();
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				kukuList.add(i * j);
			}
		}

		if (kukuList.contains(N)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}