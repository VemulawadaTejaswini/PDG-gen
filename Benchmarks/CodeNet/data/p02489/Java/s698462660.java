public class Main {
	public static void main(String[] args) {
		int i = 1;
		while (1) {
			java.util.Scanner scan = new java.util.Scanner(System.in);
			String a1 = scan.next();
			int a = Integer.parseInt(a1);
			if (a == 0) break;
			System.out.println("Case " + i + ": " + a);
			i++;
		}
	}
}