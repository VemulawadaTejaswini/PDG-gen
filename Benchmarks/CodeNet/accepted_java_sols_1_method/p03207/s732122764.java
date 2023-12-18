import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Integer> productList = new ArrayList<>();
		int temp;
		int answer = 0;

		int N = scanner.nextInt();

		for(int i = 0; i < N; i++) {
			temp = scanner.nextInt();
			productList.add(Integer.valueOf(temp));
			answer += temp;
		}

		Optional<Integer> max = productList.stream().max(Comparator.naturalOrder());

		System.out.println(answer - (max.get()/2));

	}

}
