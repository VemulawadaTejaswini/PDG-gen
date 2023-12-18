import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		List<Integer> list = new ArrayList<>();
		list.add(a);
		if (b != a) {
			list.add(b);
		}
		if (c != a && c != b) {
			list.add(c);
		}
		System.out.println(list.size());
	}

}