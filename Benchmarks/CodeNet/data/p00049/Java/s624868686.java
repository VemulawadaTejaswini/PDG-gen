import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner stdin = new Scanner(System.in);
		String blood = null;
		String[] str = new String[2];
		Arrays.fill(str, null);

		int a = 0;
		int b = 0;
		int ab = 0;
		int o = 0;

		while(stdin.hasNext()) {

			blood = stdin.next();
			str = blood.split(",");
			if(str[1].equals("A")) {
				a++;
			} else if(str[1].equals("B")) {
				b++;
			}  else if(str[1].equals("AB")) {
				ab++;
			} else if(str[1].equals("O")) {
				o++;
			}

		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(o);


	}

}