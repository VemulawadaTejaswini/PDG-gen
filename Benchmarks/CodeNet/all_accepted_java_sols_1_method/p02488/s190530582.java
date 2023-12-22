import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = in.nextInt();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			list.add(in.next());
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}
}