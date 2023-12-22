import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s = kb.next();
		String t = kb.next();
		String u = "";
		for (int i = 0; i < n; i++) {
			u += s.charAt(i);
			u += t.charAt(i);
		}
		System.out.println(u);
		kb.close();

	}

}
