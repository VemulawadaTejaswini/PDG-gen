import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		int count = Integer.parseInt(line);

		List<Integer> list = new ArrayList<>();
		String[] array = sc.nextLine().split(" ");
		for (int i = 0; i < count; i++) {
			list.add(Integer.parseInt(array[i]));
		}
		int max = list.stream().max(Comparator.naturalOrder()).get();
		int min = list.stream().min(Comparator.naturalOrder()).get();
	
		System.out.println(max - min);
	}
}
