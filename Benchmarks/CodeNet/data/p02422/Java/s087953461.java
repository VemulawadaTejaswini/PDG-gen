import java.util.Scanner;

public class Main {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer(s.next());
		int q = s.nextInt();

		for(int i=1; i<=q; i++) {
			String action = s.next();
			int a = s.nextInt();
			int b = s.nextInt();

			if(action.equals("print")) {
				System.out.println(sb.toString().substring(a, b+1));

			} else if(action.equals("reverse")) {
				StringBuffer temp = new StringBuffer(sb.toString().substring(a, b+1));
				temp = temp.reverse();
				sb = sb.replace(a, b+1, temp.toString());

			} else {
				StringBuffer p = new StringBuffer(s.nextInt());
				sb = sb.replace(a, b+1, p.toString());

			}
		}
	}

}