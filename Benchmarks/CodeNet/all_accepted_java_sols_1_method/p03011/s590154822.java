import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int P = scanner.nextInt();
		int Q = scanner.nextInt();
		int R = scanner.nextInt();
		scanner.close();
		List<Integer>list = Arrays.asList(P, Q, R);
		list = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list.get(0)+list.get(1));
	}
}