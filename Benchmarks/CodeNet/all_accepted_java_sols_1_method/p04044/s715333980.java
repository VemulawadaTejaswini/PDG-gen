import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		List<String> list = new ArrayList<>();
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = 0; i < a; i++) {
			list.add(sc.next());
		}
		Collections.sort(list);
		for (String s : list) {
			str += s;
		}
		System.out.println(str);
	}

}
