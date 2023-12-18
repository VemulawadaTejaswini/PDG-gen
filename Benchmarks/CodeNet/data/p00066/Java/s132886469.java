import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		char[][] map = new char[3][3];

		for (; sc.hasNextLine();) {

			String buffer = sc.nextLine();

			if (buffer.equals("_"))

				break;

			for (int i = 0; i < 9; i++) {

				map[i / 3][i % 3] = buffer.charAt(i);

			}



			boolean x, o,b=false;

			for (int k = 0; k < 3; k++) {

				x = true;

				o = true;

				for (int j = 0; j < 3; j++) {

					x &= map[k][j] == 'x';

					o &= map[k][j] == 'o';

				}

				if(x){

					System.out.println('x');

					b= true;

					break;

				}

				if(o){

					System.out.println('o');

					b= true;

					break;

				}

				x = true;

				o = true;

				for (int j = 0; j < 3; j++) {

					x &= map[j][k] == 'x';

					o &= map[j][k] == 'o';

				}

			}

			if(b) continue;

			x = true;

			o = true;

			for (int j = 0; j < 3; j++) {

				x &= map[j][j] == 'x';

				o &= map[j][j] == 'o';

			}

			if(x){

				System.out.println('x');

				continue;

			}

			if(o){

				System.out.println('o');

				continue;

			}

			x = true;

			o = true;

			for (int j = 0; j < 3; j++) {

				x &= map[j][2-j] == 'x';

				o &= map[j][2-j] == 'o';

			}

			if(x){

				System.out.println('x');

				continue;

			}

			if(o){

				System.out.println('o');

				continue;

			}

			System.out.println('d');

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();



	}

}