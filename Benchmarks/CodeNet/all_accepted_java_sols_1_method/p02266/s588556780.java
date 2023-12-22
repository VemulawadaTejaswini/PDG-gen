import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		int[] level = new int[input.length + 1];
		Map<Integer, Integer> levelMap = new HashMap<Integer, Integer>();
		List<Integer> startIndex = new ArrayList<Integer>();
		List<Integer> endIndex = new ArrayList<Integer>();

		level[0] = 100;
		levelMap.put(100, 1);
		for (int i = 1; i < input.length + 1; i++) {
			char c = input[i - 1];

			switch (c) {
				case '_' :
					level[i] = level[i - 1];
					break;
				case '/' :
					level[i] = level[i - 1] + 1;
					break;
				case '\\' :
					level[i] = level[i - 1] - 1;
					break;
			}

			if (levelMap.containsKey(level[i])) {
				levelMap.put(level[i], levelMap.get(level[i]) + 1);
			} else {
				levelMap.put(level[i], 1);
			}
		}

		// for (Map.Entry<Integer, Integer> entry : levelMap.entrySet()) {
		//	System.out.println(entry.getKey() + ", " + entry.getValue());
		// }

		MAINLOOP : for (int i = 0; i < level.length - 1;) {

			while (input[i] != '\\') {
				levelMap.put(level[i], levelMap.get(level[i]) - 1);
				if (i + 1 < input.length)
					i++;
				else
					break MAINLOOP;
			}

			if (levelMap.get(level[i]) > 1) {
				levelMap.put(level[i], levelMap.get(level[i]) - 1);

				int j;
				for (j = i + 1; j < level.length; j++) {
					if (level[i] == level[j]) {
						break;
					}
					levelMap.put(level[j], levelMap.get(level[j]) - 1);
				}

				startIndex.add(i);
				endIndex.add(j);
				i = j;
			} else {
				boolean existSameLevel = false;
				int targetLevel = 0;
				for (int j = level[i] - 1; levelMap.containsKey(j); j--) {
					if (levelMap.get(j) > 1) {
						existSameLevel = true;
						targetLevel = j;
						break;
					}
				}

				if (existSameLevel) {
					levelMap.put(level[i], levelMap.get(level[i]) - 1);
					int j;
					for (j = i + 1; j < level.length; j++) {
						if (level[j] == targetLevel) {
							break;
						}
						levelMap.put(level[j], levelMap.get(level[j]) - 1);
					}
					startIndex.add(j);

					for (j += 1; j < level.length; j++) {
						levelMap.put(level[j], levelMap.get(level[j]) - 1);
						if (level[j] == targetLevel) {
							break;
						}
					}

					endIndex.add(j);
					i = j;
				} else {
					break;
				}
			}
		}

		int[] water = new int[startIndex.size()];
		int waterNum = 0;
		int allSum = 0;
		
		
		for (int i = 0; i < startIndex.size(); i++) {
			int start = startIndex.get(i);
			int end = endIndex.get(i);
			// System.out.println(startIndex.get(i) + " -> " + endIndex.get(i));

			int sum = 0;
			
			for (int j = start; j < end; j++) {
				boolean isUp = false;
				boolean isExist = false;
				
				if (input[j] != '\\')
					continue;
				
				int length = 0;
				
				for (int k = j+1; k <= end; k++) {
					length++;
					if (k < input.length && input[k] == '/')
						isUp = true;
					
					if (level[j] == level[k]) {
						isExist = true;
						break;
					}
				}

				if (isUp && isExist) {
					// System.out.println("length = " + length);
					sum += (length * 2 - 2) / 2;
				}
			}
			
			if (sum > 0) {
				water[waterNum++] = sum;
				allSum += sum;
			}
		}

		System.out.println(allSum);
		System.out.print(waterNum);
		
		for (int i = 0; i < waterNum; i++) {
			System.out.print(" " + water[i]);
		}
		System.out.println();

		br.close();
	}

}