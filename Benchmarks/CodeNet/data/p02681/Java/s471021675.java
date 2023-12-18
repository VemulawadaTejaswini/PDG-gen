public class Main{

	public static void main(String[] args) {

		String s = new java.util.Scanner(System.in).nextLine();
		String t = new java.util.Scanner(System.in).nextLine();

		int sSize = s.length();

		String tMinus1 = t.substring(0, sSize);

		if (tMinus1.equals(s)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}
}
