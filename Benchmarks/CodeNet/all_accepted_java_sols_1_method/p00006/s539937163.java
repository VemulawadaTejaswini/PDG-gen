import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		for (int i = st.length() - 1; 0 <= i; i--) {
			System.out.print(st.charAt(i));
		}
		System.out.println();
	}
}