import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		System.out.println(CaseReverse(tmp));
		// int length = tmp.split(",").length;
		// for (int i = 0; i < length; i++) {
			// System.out.print(CaseReverse(tmp.split(",")[i]));
			// if(i != length - 1){
			// 	System.out.print(".");
			// }else{
				// System.out.print(",");
			// }
		// }
	}

	static String CaseReverse(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				c += 32;
				sb.append(c);
			} else if(Character.isLowerCase(c)) {
				c -= 32;
				sb.append(c);
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}

