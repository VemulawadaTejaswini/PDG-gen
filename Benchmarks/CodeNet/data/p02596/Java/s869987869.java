package AtcorderBiginnerContest174;

import java.util.HashSet;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int k = s.nextInt();

		int m = 7 % k;
		int count = 1;
		HashSet<Integer> a = new HashSet<>();  //余りを格納
		a.add(m);

		if(m == 0) {
			System.out.println(count);
			return ;
		}

		while(m != 0) {

			m = (10 * m + 7) % k;
			count++;
			System.out.println(a);

			if(a.contains(m)) {
				System.out.println("-1");
				return ;
			}else {
				a.add(m);
			}

			if(m == 0) {
				System.out.println(count);
				return ;
			}



		}

	}

}
