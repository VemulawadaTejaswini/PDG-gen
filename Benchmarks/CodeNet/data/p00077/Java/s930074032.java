import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		for (; sc.hasNextLine();) {

			char[] in = sc.nextLine().toCharArray();

			String ans = "";

			for (int i = 0; i < in.length; i++) {

				if (in[i] == '@') {

					char rep = in[i + 2];

					int count = in[i+1] - '0' ;

					for (int j = 0; j < count; j++) {

						ans += rep;

					}

					i+=2;

				}else{

					ans += in[i];

				}

			}

			System.out.println(ans);

		}

	}

	



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}