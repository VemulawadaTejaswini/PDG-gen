import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		List<String> list = new ArrayList<String>() {
			{
				add("SUN");
				add("MON");
				add("TUE");
				add("WED");
				add("THU");
				add("FRI");
				add("SAT");
			}
		};

		System.out.println(7 - list.indexOf(s));
	}
}
