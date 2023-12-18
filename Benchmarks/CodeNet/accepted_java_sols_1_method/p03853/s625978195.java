import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		int w = scan.nextInt();

		int i = 0;
		String[] ary = new String[h];

		for (i = 0; i < h; i++) {
			ary[i] = scan.next();
		}

		//System.out.println(ary[0]);
		//System.out.println(ary[1]);

		int j = 0;
		String k = "";

		for (j = 0; j < h; j++) {
			k=k+""+ary[j]+ary[j];

				System.out.println(ary[j] );
				System.out.println(ary[j]);


		}

	}

}
