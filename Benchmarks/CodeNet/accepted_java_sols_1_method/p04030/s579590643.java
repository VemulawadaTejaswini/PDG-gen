import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			String sSub = String.valueOf(s.charAt(i));
			if ("0".equals(sSub)) {
				list.add(sSub);
			} else if ("1".equals(sSub)) {
				list.add(sSub);
			} else {
				if (list.size() != 0) {
					list.remove(list.size() - 1);
				}
			}
		}
		for (String str : list) {
			System.out.print(str);
		}
	}

}
