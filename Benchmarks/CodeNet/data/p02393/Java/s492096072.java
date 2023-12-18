import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in);) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			List<Integer> list = new ArrayList<>();
			list.add(a);
			list.add(b);
			list.add(c);
			
			list.sort(Comparator.naturalOrder());
			
			System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
		}
	}

}
