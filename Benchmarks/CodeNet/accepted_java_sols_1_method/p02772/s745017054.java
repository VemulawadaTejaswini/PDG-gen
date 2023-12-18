import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	//C問題

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numCount;
		List<Integer> lists = new ArrayList<Integer>();

		boolean okFlg = false;

		numCount = scan.nextInt();

		for (int i = 0; i < numCount; i++) {
			lists.add(scan.nextInt());
		}

		Optional<Integer> item = lists.stream().filter(num -> num % 2 == 0)
				.filter(num -> num % 3 != 0 && num % 5 != 0)
				.findFirst();

		if (item.isPresent()) {
			System.out.println("DENIED");
		} else {
			System.out.println("APPROVED");
		}

		// APPROVED を、しないならば DENIED を出力
	}

}