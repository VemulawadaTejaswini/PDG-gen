
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (N-- != 0) {
			list.add(sc.nextInt());
		}
		Collections.reverse(list);
		ln(join(list, " "));
	}

	public static String join(Collection<?> array, String separator) {
		Iterator<?> it = array.iterator();
		StringBuilder str = new StringBuilder(it.next() + "");
		while (it.hasNext()) {
			str.append(separator).append(it.next() + "");
		}
		return str.toString();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}