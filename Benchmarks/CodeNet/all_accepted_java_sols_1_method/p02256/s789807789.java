import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] kz = line.split(" ");
		int v1 = Integer.parseInt(kz[0]);
		int v2 = Integer.parseInt(kz[1]);
		List<Integer> vlist = new ArrayList<Integer>();
		List<Integer> v3list = new ArrayList<Integer>();
		List<Integer> kouyaku = new ArrayList<Integer>();
		if (v1 < v2) {
			int v3 = v2 % v1;
			if (v1 >= v3) {

				for (int i = 1; i <= v3; i++) {
					if (v3 % i == 0) {
						v3list.add(i);
					}
					if (v1 % i == 0) {
						vlist.add(i);
					}
				}
			} else {
				for (int i = 1; i <= v1; i++) {
					if (v3 % i == 0) {
						v3list.add(i);
					}
					if (v1 % i == 0) {
						vlist.add(i);
					}
				}

			}

		} else if (v1 > v2) {
			int v3 = v1 % v2;
			if (v3 >= v2) {

				for (int i = 1; i <= v2; i++) {
					if (v2 % i == 0) {
						vlist.add(i);
					}
					if (v3 % i == 0) {
						v3list.add(i);
					}

				}
			} else {

				for (int i = 1; i <= v3; i++) {
					if (v3 % i == 0) {
						v3list.add(i);
					}
					if (v2 % i == 0) {
						vlist.add(i);
					}
				}
			}
		} else {
			kouyaku.add(v1);
		}

		for (int integer : vlist) {
			for (int in : v3list) {
				if (integer == in) {
					kouyaku.add(in);
					break;

				} else if (integer < in) {
					break;
				}
			}
		}
		System.out.println(java.util.Collections.max(kouyaku));

	}
}