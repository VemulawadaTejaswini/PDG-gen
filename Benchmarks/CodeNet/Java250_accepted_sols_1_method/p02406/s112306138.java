import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int num = Integer.parseInt(line);

		StringBuilder ans = new StringBuilder();
		int x = 3;
		for (int i = 3; i <= num; i++) {

			if (i % 3 == 0  || i % 10 == 3) {
				ans.append(" " + i);

			} else{
				while ( x >= 1 ) {
					if (x %10 == 3) {
						ans.append(" " + i);
						break;
					}
					x/=10;
				}

			}
			x = i;
			x ++;
		}

		String d = ans.toString();
		System.out.println(d);
	}

//330番台がかぶっているのでそれをなんとかする
}

