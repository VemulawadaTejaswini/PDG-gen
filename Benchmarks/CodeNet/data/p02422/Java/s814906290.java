import java.util.Scanner;

public class Main {

	enum ORDER {
		print, reverse, replace;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int orderCount = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < orderCount; i++) {
			String[] orderStr = sc.nextLine().split("[\\s]+");
			ORDER order = ORDER.valueOf(orderStr[0]);
			switch (order) {
			case print:
				Print(str, orderStr[1], orderStr[2]);
				break;
			case reverse:
				str = Reverse(str, orderStr[1], orderStr[2]);
				break;
			case replace:
				str = Replace(str, orderStr[1], orderStr[2], orderStr[3]);
			}
		}

	}

	static void Print(String str, String a, String b) {
		System.out.println(str.substring(Integer.parseInt(a), Integer.parseInt(b) + 1));
	}

	static String Reverse(String str, String a, String b) {
		char[] carray = str.toCharArray();
		int start = Integer.parseInt(a), end = Integer.parseInt(b);
		for (int i = start; i <= (start + end) / 2; i++) {
			char work = carray[end - i];
			carray[end - i] = carray[i];
			carray[i] = work;
		}
		return String.valueOf(carray);
	}

	static String Replace(String str, String a, String b, String c) {
		String result = str.substring(0, Integer.parseInt(a));
		result += c;
		if (Integer.parseInt(b) + 1 != str.length()) {
			result += str.substring(Integer.parseInt(b) + 1);
		}
		return result;
	}

}

