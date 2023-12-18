import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String buf = "";

		for(int i = 3; i <= n; i++) {

			if(i % 3 == 0 | i % 10 == 3) {
				buf += " " + String.valueOf(i);
			}

		}

		System.out.println(buf);

	}

}



