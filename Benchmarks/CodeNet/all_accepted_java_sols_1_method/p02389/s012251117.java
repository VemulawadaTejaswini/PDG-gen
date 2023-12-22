import java.util.*;

class Main
{
	public static void main(String args[]) {

		try {

			Scanner sc = new Scanner(System.in);

			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());



			System.out.println((a*b) +" "+ (a+a+b+b));
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}