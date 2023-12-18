import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<char[]> dicList = new ArrayList<char[]>();
		String order, str;

		for (int i = 0; i < n; i++) {
			order = sc.next();
			str = sc.next();
			char[] charArray = str.toCharArray();
			if (order.equals("insert")) {
				dicList.add(charArray);
			} else if (order.equals("find")) {
				findDic(dicList, charArray);
			}
		}
	}

	public static boolean isEqualStr(char[] dicChar, char[] charArray) {
		if (dicChar.length != charArray.length)
			return false;

		for (int i = 0; i < charArray.length; i++) {
			if (dicChar[i] != charArray[i])
				return false;
		}
		return true;
	}

	public static void findDic(ArrayList dicList, char[] charArray) {
		for (int i = 0; i < dicList.size(); i++) {
			if (isEqualStr((char[]) dicList.get(i), charArray)) {
				System.out.println("yes");
				return;
			}
		}
		System.out.println("no");
		return;
	}
}

