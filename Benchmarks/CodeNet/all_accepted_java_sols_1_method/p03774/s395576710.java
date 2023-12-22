import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> stX = new ArrayList<Integer>();
		ArrayList<Integer> stY = new ArrayList<Integer>();
		ArrayList<Integer> cpX = new ArrayList<Integer>();
		ArrayList<Integer> cpY = new ArrayList<Integer>();
		ArrayList<Integer> dis = new ArrayList<Integer>();
		int stnum = sc.nextInt();
		int cpnum = sc.nextInt();

		for (int i = 0; i < stnum; i++) {
			stX.add(sc.nextInt());
			stY.add(sc.nextInt());
		}
		for (int i = 0; i < cpnum; i++) {
			cpX.add(sc.nextInt());
			cpY.add(sc.nextInt());
		}

		for (int i = 0; i < stnum; i++) {
			int sX = stX.get(i);
			int sY = stY.get(i);
			int min = 1000000000;
			int cp = 0;

			ArrayList<Integer> disL = new ArrayList<Integer>();

			for (int k = 0; k < cpnum; k++)
				disL.add(Math.abs(sX - cpX.get(k)) + Math.abs(sY - cpY.get(k)));

			for (int j = 0; j < cpnum; j++) {
				if (min > disL.get(j)) {
					min = disL.get(j);
					cp = j + 1;
				}
			}

			dis.add(cp);
		}

		for (int i = 0; i < stnum; i++)
			System.out.println(dis.get(i));
	}
}
