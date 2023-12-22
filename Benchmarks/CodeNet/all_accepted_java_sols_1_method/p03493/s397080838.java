import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String st = scan.nextLine();
		int ans = 0;
		for (int i = 0; i < 3; i++) {
			char ch = st.charAt(i);
			if (ch == '1') {
				ans += 1;
			}
		}
		System.out.println(ans);
	}

}
