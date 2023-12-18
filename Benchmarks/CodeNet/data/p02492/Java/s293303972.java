public class Main {
	public static void main(String[] args) {
		while(true) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		String str3 = in.next();
		int int1 = java.lang.Integer.parseInt(str1);
		int int2 = java.lang.Integer.parseInt(str3);
		if(str2.equals("?")) break;
		if(str2.equals("+"))
			System.out.println(int1 + int2);
		if(str2.equals("-"))
			System.out.println(int1 - int2);
		if(str2.equals("*"))
			System.out.println(int1 * int2);
		if(str2.equals("/"))
			if(int2 == 0) {
				//エラー
			}
			else
				System.out.println(int1 / int2);
		}
	}
}