import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b;
		String op;

		ArrayList<String> buf = new ArrayList<String>();


		a = sc.nextInt();
		op = sc.next();
		b = sc.nextInt();


		while (!op.equals("?")) {

			switch (op) {

			case ("+"):
				buf.add(String.valueOf(a+b));
			break;

			case ("-"):
				buf.add(String.valueOf(a-b));
			break;

			case ("*"):
				buf.add(String.valueOf(a*b));
			break;

			case ("/"):
				buf.add(String.valueOf(a/b));
			break;

			}

			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();

		}

//		System.out.println(buf);

		for(int i = 0; i < buf.size(); i++) {
			System.out.println(buf.get(i));
		}


	}

}



