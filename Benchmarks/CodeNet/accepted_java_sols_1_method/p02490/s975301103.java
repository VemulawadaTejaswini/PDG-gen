public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		while(true) {
			String str1 = in.next();
			String str2 = in.next();
			int int1 = java.lang.Integer.parseInt(str1);
			int int2 = java.lang.Integer.parseInt(str2);
			if(java.lang.Integer.parseInt(str1) == 0 && java.lang.Integer.parseInt(str2) == 0) break;
			if(int1 < int2)
				System.out.println(str1 + " " + str2);
			else
				System.out.println(str2 + " " + str1);
		}
	}
}