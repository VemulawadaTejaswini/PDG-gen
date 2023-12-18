import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<Integer> aArr = new ArrayList();
		ArrayList<Integer> countLight = new ArrayList();

		for (int i = 0; i < n; i++) {
			aArr.add(sc.nextInt());
		}

		outloop: while (k > 0) {
			for (int i = 0; i < n; i++) {
				countLight.add(0);
			}
			int aIndex = 1;
			for (int a : aArr) {
				if (a == 0) {
					countLight.set(aIndex - 1, countLight.get(aIndex - 1) + 1);
				} else {
					// 電球の照らす範囲
					int lightD = aIndex - a;
					int lightU = aIndex + a;
					// 照らされている数を数える
					for (int j = lightD; j <= lightU; j++) {
						if (0 < j && j <= n) {
							countLight.set(j - 1, countLight.get(j - 1) + 1);
						}
					}
				}
				aIndex++;
			}
			k--;
			for (int i = 0; i < aArr.size(); i++) {
				if (aArr.get(i) != countLight.get(i)) {
					break;
				}
				if (i == aArr.size() - 1) {
					break outloop;
				}
			}
			aArr.clear();
			aArr.addAll(countLight);
			countLight.clear();
		}

		StringBuilder sb = new StringBuilder();
		for (int a : aArr) {
			sb.append(a);
			sb.append(" ");
		}
		sb.setLength(sb.length() - 1);
		// 出力
		System.out.println(sb.toString());
	}
}