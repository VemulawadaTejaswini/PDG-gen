import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		int a = sn.nextInt();
		int b = sn.nextInt();
		int c = sn.nextInt();

		List<Integer> list = new ArrayList<Integer>();
	    list.add(a);
	    list.add(b);
	    list.add(c);

	    Collections.sort(list);

		System.out.println(list.get(0) + list.get(1));
	}
}