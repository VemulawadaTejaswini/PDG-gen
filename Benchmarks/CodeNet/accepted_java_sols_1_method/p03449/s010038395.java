import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = Integer.parseInt(sc.nextLine());
			String firstRowValue = sc.nextLine();
			String secondRowValue = sc.nextLine();
			List<Integer> firstRow = Arrays.asList(firstRowValue.split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
			List<Integer> secondRow = Arrays.asList(secondRowValue.split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());

			ArrayList<Integer> resultList = new ArrayList<>();
			for(int i = 0 ; i < n ; i++) {
				int sum = 0;
				for(int j=0 ; j < n ; j++) {
					if(i > j) {
						sum += firstRow.get(j);
					} else if (i == j) {
						sum += firstRow.get(j);
						sum += secondRow.get(j);
					} else {
						sum += secondRow.get(j);
					}
				}
				resultList.add(sum);
			}

			Optional<Integer> maxOpt = resultList.stream().max(Comparator.naturalOrder());
			System.out.println(maxOpt.get());

		}
	}
}