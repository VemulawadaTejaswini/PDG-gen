

public class Main {
	public static void main(String args[]) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		long N = sc.nextLong();
		String s = sc.next();

		String ss = s.substring(0, (int)N/2);

		if (s.equals(ss + ss)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}