import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2_m = sc.nextLine();

		str2_m = "0 " + str2_m + " 0";

		String[] str2 = str2_m.split(" ");

		int n = Integer.parseInt(str1) + 2;

		List<Integer> d = new ArrayList<Integer>();
		List<Integer> s = new ArrayList<Integer>();
		List<Boolean> bIsLarge = new ArrayList<Boolean>();
		for (int i = 0; i < str2.length; i++) {
			d.add(Integer.parseInt(str2[i]));
		}

		for (int i = 0; i < n - 1; i++) {
			int a = Integer.parseInt(str2[i]) + 5000;
			int a1 = Integer.parseInt(str2[i + 1]) + 5000;

			if (a > a1) {
				s.add(a - a1);
				bIsLarge.add(true);
			} else {
				s.add(a1 - a);
				bIsLarge.add(false);
			}
		}

		int sum = s.stream().mapToInt(Integer::intValue).sum();

		for (int i = 0; i < n - 2; i++) {
			if (bIsLarge.get(i) == bIsLarge.get(i + 1)) {
				System.out.println(sum);
			} else {
				if (d.get(i) < d.get(i + 2)) {
					if (bIsLarge.get(i)) {
						System.out.println(sum - s.get(i) * 2);
					} else {
						System.out.println(sum - s.get(i + 1) * 2);
					}
				} else {
					if (bIsLarge.get(i)) {
						System.out.println(sum - s.get(i + 1) * 2);
					} else {
						System.out.println(sum - s.get(i) * 2);
					}
				}
			}

		}

		sc.close();
	}

}
