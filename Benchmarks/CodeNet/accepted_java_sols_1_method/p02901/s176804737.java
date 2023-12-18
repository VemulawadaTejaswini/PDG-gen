import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final int INF = 9999999;

		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();

		String[] stringArray = str1.split(" ");

		int chestCount = Integer.parseInt(stringArray[0]);
		int keyCount = Integer.parseInt(stringArray[1]);

		List<int[]> keyList = new ArrayList<>();

		for (int i = 0; i < keyCount; i++) {

			// 0:開けれる宝箱 1:値段
			int[] key = new int[2];

			String strTemp1 = scan.nextLine();
			String[] stringTemp1Array = strTemp1.split(" ");

			key[1] = Integer.parseInt(stringTemp1Array[0]);

			String strTemp2 = scan.nextLine();
			String[] stringTemp2Array = strTemp2.split(" ");

			int openNumberBitInt = 0;

			for (String openNumberStr : stringTemp2Array) {

				int openNumberInt = Integer.parseInt(openNumberStr);

				openNumberBitInt = openNumberBitInt | 1 << openNumberInt - 1;
			}

			key[0] = openNumberBitInt;

			keyList.add(key);
		}

		int allChestOpenStatusCount = (int) Math.pow(2, chestCount);

		// 全ての宝箱を開けられるか確認
		int openStatus = 0;

		for (int[] key : keyList) {

			openStatus = openStatus | key[0];
		}

		if (openStatus != allChestOpenStatusCount - 1) {

			System.out.println("-1");
			return;
		}

		Map<Integer, Integer> chestOpenStatusMap = new HashMap<>();

		for (int i = 0; i < allChestOpenStatusCount; i++) {

			chestOpenStatusMap.put(i, INF);
		}

		chestOpenStatusMap.put(0, 0);

		for (int i = 0; i < allChestOpenStatusCount; i++) {

			for (int[] key : keyList) {

				int newChestOpenStatus = i | key[0];
				int newPrice = chestOpenStatusMap.get(i) + key[1];

				if (chestOpenStatusMap.get(newChestOpenStatus) > newPrice) {

					chestOpenStatusMap.put(newChestOpenStatus, newPrice);
				}
			}
		}

		int answer = chestOpenStatusMap.get(allChestOpenStatusCount - 1);

		System.out.println(answer);
	}
}
