import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n;
		while (scn.hasNextInt()) {
			n = scn.nextInt();
			ArrayList<Integer> num = new ArrayList<Integer>();
			for (int i = 2; i <= n; i++) {
				num.add(i);
			}
			for (int i = 0; i < num.size(); i++) {
				for (int j = i + 1; j < num.size();) {
					if (num.get(j) % num.get(i) == 0) {
						num.remove(j);
					} else {
						j++;
					}
				}
			}
			System.out.println(num.size());
		}
		scn.close();
	}
}

