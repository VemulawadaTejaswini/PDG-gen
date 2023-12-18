import java.util.Scanner;
 
public class Main {
	private static final String SPLIT_STR = " ";

	private static final String ORDER_PRINT = "print";
	private static final String ORDER_REVERSE = "reverse";
	private static final String ORDER_REPLACE = "replace";

	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 文字列 str
		int q = sc.nextInt(); // 命令の数 q
		sc.nextLine(); // 空白を一度スキャン

		String result = str;

		for (int i=0; i<q; i++) {
            String orderStr = sc.nextLine(); // 各命令
			String[] orderSplit = orderStr.split(SPLIT_STR);
			String order = orderSplit[0];
			int beginIndex = Integer.parseInt(orderSplit[1]);
			int endIndex = Integer.parseInt(orderSplit[2]);
			if (ORDER_PRINT.equals(order)) {
				System.out.println(result.substring(beginIndex, endIndex + 1));
			}
			if (ORDER_REVERSE.equals(order)) {
				result = reverse(result, beginIndex, endIndex);
			}
			if (ORDER_REPLACE.equals(order)) {
				String p = orderSplit[3];
				result = replace(result, beginIndex, endIndex, p);
			}
		}
		sc.close();
	}

	private static String reverse(String str, int beginIndex, int endIndex) {
		char[] charArray = str.toCharArray();
		int max = endIndex - beginIndex;
		for (int i = 0; i <= max; i++) {
			charArray[beginIndex + i] = str.charAt(endIndex - i);
		}
		return String.valueOf(charArray);
	}

	private static String replace(String str, int beginIndex, int endIndex, String replaceStr) {
		char[] charArray = str.toCharArray();
		int max = endIndex - beginIndex;
		for (int i = 0; i <= max; i++) {
			charArray[beginIndex + i] = replaceStr.charAt(i);
		}
		return String.valueOf(charArray);
	}
}

