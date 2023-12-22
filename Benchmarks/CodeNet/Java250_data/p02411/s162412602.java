

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();

		while(true) {

			int middle = in.nextInt();
			int term_end = in.nextInt();
			int retest = in.nextInt();
			int sum = middle + term_end;

			if(middle == -1 && term_end == -1 && retest == -1) {

				break;

			}else if(middle == -1 || term_end == -1) {

				list.add("F");

			}else if(sum >= 80) {

				list.add("A");

			}else if(sum < 80 && sum >= 65) {

				list.add("B");

			}else if(sum < 65 && sum >= 50) {

				list.add("C");

			}else if(sum < 50 && sum >= 30) {

				if(retest >=  50) {

					list.add("C");

				}else {

					list.add("D");

				}

			}else if(sum < 30) {

				list.add("F");

			}
		}

		for(String seiseki: list) {

			System.out.println(seiseki);

		}
	}
}