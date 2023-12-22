import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		String[] a = string.split(" ");
		ArrayList<Integer> number = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {

			if (a[i].equals("+")) {
				int p = number.get(number.size() - 1);
				number.remove(number.size() - 1);
				int q = number.get(number.size() - 1);
				number.remove(number.size() - 1);
				number.add(p + q);
				continue;

			}
			if (a[i].equals("-")) {
				int p = number.get(number.size() - 2);
				number.remove(number.size() - 2);
				int q = number.get(number.size() - 1);
				number.remove(number.size() - 1);
				number.add(p - q);
				continue;
			}
			if (a[i].equals("*")) {
				int p = number.get(number.size() - 1);
				number.remove(number.size() - 1);
				int q = number.get(number.size() - 1);
				number.remove(number.size() - 1);
				number.add(p * q);
				continue;
			}

			int n = Integer.parseInt(a[i]);
			number.add(n);

		}

		System.out.println(number.get(0));

	}
}