import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> dList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			dList.add(sc.nextInt());
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - 1; j++) {
				sum += dList.get(i) * dList.get(j + 1);
			}
		}
		System.out.println(sum);
		sc.close();

	}

}