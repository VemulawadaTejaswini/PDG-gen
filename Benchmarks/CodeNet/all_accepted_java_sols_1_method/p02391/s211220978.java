import java.util.*;

class Main
{
	public static void main(String args[]) {

		try {

			Scanner sc = new Scanner(System.in);

			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());

			if (a>b) {
				System.out.println("a > b");
			}
			else if (a<b) {
				System.out.println("a < b");
			}
			else {
				System.out.println("a == b");
			}

		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}