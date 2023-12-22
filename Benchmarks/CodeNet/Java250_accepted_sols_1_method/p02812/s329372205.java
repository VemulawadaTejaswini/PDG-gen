public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		String[] S = (sc.next() + " ").split("ABC");

		System.out.print(S.length - 1);
	}
}