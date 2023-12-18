import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var a = new ArrayList<Integer>();
		for (var i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		sc.close();
		Collections.sort(a);
		Collections.reverse(a);

		var list = new ArrayList<Integer>();
		list.add(a.get(0));
		var count = 0;
		for (var i = 1; i < a.size(); i++) {
			count += list.get(0);
			list.remove(0);
			list.add(a.get(i));
			list.add(a.get(i));
		}
		System.out.println(count);
	}
}