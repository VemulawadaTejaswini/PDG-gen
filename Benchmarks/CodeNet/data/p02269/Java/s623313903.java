
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> dicList = new ArrayList<String>();
		String order, str;

		for (int i = 0; i < n; i++) {
			order = sc.next();
			str = sc.next();
			if (order.equals("insert")) {
				dicList.add(str);
			} else if (order.equals("find")) {
				findDic(dicList, str);
			}
		}
	}

	public static void findDic(ArrayList<String> dicList, String str) {
		if (dicList.contains(str)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}
}

