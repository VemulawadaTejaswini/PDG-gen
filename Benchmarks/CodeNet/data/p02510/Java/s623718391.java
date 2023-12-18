import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		int strlen, scount, shufflen, i;
		while (true) {
			str = scanner.next();
			strlen = str.length();
			if (str.equals("-")) break;
			else {
				scount = scanner.nextInt();
				for (i = 0; i < scount; i ++) {
					shufflen = scanner.nextInt();
					str = str.substring(shufflen) + str.substring(0, shufflen); 
				}
				System.out.println(str);
			}
		}
	}
}