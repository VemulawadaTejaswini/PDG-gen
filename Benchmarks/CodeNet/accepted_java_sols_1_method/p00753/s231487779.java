import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numlist = new ArrayList<Integer>();

		numlist.add(2);
		for (int i = 3; i < 123457*2; i += 2) {
			boolean TF = true;
			for (Integer integer : numlist) {
				if (integer * 2 > i) {
					break;
				}
				if ((i % integer) == 0) {
					TF = false;
					break;
				} else {
					continue;
				}
			}
			if (TF) {
				numlist.add(i);
			}
		}

		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int count = 0;
			for (Integer integer : numlist) {
				if (n < integer) {
					if (integer <= 2 * n) {
						count++;
					} else {
						break;
					}
				}
			}
			System.out.println(count);
		}

	}

}