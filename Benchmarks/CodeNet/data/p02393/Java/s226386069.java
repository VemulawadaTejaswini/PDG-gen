import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		char delimeter = ' '
		List<Integer> list = new ArrayList<>();

		while(sc.hasNextInt()) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);

		a = list.get(0);
		b = list.get(1);
		c = list.get(2);

		System.out.println(a + delimeter + b + delimeter + c);
	}
}