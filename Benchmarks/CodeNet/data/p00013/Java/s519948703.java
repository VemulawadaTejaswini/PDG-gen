import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> train = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println(train.get(train.size() - 1));
				train.remove(train.size() - 1);
			} else {
				train.add(num);
			}
		}
		sc.close();
	}
}

