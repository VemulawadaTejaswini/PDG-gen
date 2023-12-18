import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int res = 0;
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> sticks = new ArrayList<Integer>();
		int amount = scn.nextInt();
		for (int i = 0; i < amount; i++) {
			sticks.add(scn.nextInt());
		}
		for (int i = 0; i < sticks.size(); i++) {
			for (int i1 = i+1; i1 < sticks.size(); i1++) {
				for (int i2 = i1+1; i2 < sticks.size(); i2++) {
					if (sticks.get(i).equals(sticks.get(i1)) || sticks.get(i).equals(sticks.get(i2)) || sticks.get(i1).equals(sticks.get(i2))) {
						continue;
					}
					if (sticks.get(i) > sticks.get(i1) && sticks.get(i) > sticks.get(i2)) {
						if (sticks.get(i) < sticks.get(i1) + sticks.get(i2)) {
							res++;
						}
						continue;
					}
					if (sticks.get(i1) > sticks.get(i) && sticks.get(i1) > sticks.get(i2)) {
						if (sticks.get(i1) < sticks.get(i) + sticks.get(i2)) {
							res++;
						}
						continue;
					}
					if (sticks.get(i2) > sticks.get(i) && sticks.get(i2) > sticks.get(i1)) {
						if (sticks.get(i2) < sticks.get(i) + sticks.get(i1)) {
							res++;
						}
						continue;
					}
				}
			}
		}
		System.out.println(res);
	}

}