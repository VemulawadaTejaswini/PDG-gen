import java.util.*;

public class Main {

	static int[] nums;
	
	public static boolean checker (int a, int b, int c) {
		return (a + 1 == b && b == c - 1) || (a == b && b == c);
	}
	
	public static boolean solve (boolean[] check, int cnt) {

		if (cnt <= 3) {
			for (int i = 0; i < nums.length; i++) {
				if (check[i]) continue;
				for (int j = i + 1; j < nums.length; j++) {
					if (check[j]) continue;
					for (int k = j + 1; k < nums.length; k++) {
						if (check[k]) continue;
						if (!checker(nums[i],nums[j],nums[k])) continue;
//						System.out.print("{" + nums[i] + "," + nums[j] + "," + nums[k] + "}");
						check[i] = (check[j] = (check[k] = true));
						if (solve(check,cnt + 1)) return true;
//						System.out.println();
						check[i] = (check[j] = (check[k] = false));

					}
				}
			}
		} else {
			int temp = -1;
			for (int i = 0; i < nums.length; i++) {
				if (!check[i]) {
					if (temp == -1) {
						temp = nums[i];
					} else {
//						System.out.println("{" + temp + "," + nums[i] + "}");
						return temp == nums[i];
					}
				}
			}
		}

		return false;

	}

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String str = sc.nextLine();
			ArrayList<Integer> list = new ArrayList<Integer>();
			main:
			for (int i = 1; i < 10; i++) {

				String temp = str + i;

				int[] seq = new int[10];
				for (int j = 0; j < temp.length(); j++)
					seq[temp.charAt(j) - '0']++;

				for (int j = 1; j < 10; j++)
					if (seq[j] > 4) continue main;

				char[] c = (temp).toCharArray();
				Arrays.sort(c);
				nums = new int[c.length];
				for (int j = 0; j < c.length; j++) {
					nums[j] = c[j] - '0';
				}
				if (solve(new boolean[c.length],0)) list.add(i);
			}

			if (list.size() >= 2) {
				System.out.print(list.get(0));
				for (int i = 1; i < list.size(); i++)
					System.out.print(" " + list.get(i));
				System.out.println();
			} else if (list.size() == 1) {
				System.out.println(list.get(0));
			} else {
				System.out.println(0);
			}

		}

	}

}