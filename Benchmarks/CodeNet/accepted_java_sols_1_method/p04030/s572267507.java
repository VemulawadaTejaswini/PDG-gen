import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			String t = String.valueOf(s.charAt(i));
			if ("0".equals(t)) {
				list.add(t);
			} else if ("1".equals(t)) {
				list.add(t);
			} else {
				if (list.size() != 0) {
					list.remove(list.size() - 1);
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

}