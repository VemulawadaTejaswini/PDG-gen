public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		int int1 = java.lang.Integer.parseInt(str1);
		int int2 = java.lang.Integer.parseInt(str2);
		System.out.println(int1 / int2 + " " + int1 % int2 + " " + String.format("%.5f", (double)int1 / int2));
	}
}