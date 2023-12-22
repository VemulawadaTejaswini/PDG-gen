import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<Integer> aList = Arrays.asList(sc.nextLine().split(" ")).stream().map(Integer::parseInt).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		Integer alice = 0;
		Integer bob = 0;
		for(int i=0; i< aList.size(); i++) {
			alice += aList.get(i);
			i++;
			if(i < aList.size()) {
				bob += aList.get(i);
			}
		}
		System.out.println(alice - bob);
	}
}
