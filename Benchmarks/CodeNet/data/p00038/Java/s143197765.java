import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
			String[] numbersStr = scan.nextLine().split(",");
			for(int i = 0; i < 5; i++) {
				Integer input = Integer.parseInt(numbersStr[i]);
				if(map.containsKey(input)) {
					map.put(input, map.get(input) + 1);
				} else {
					map.put(input, 1);
				}
			}
			outputHand(map);
		}
		scan.close();
	}

	public static void outputHand(TreeMap<Integer, Integer> map) {
		if(isFourCard(map)) {
			System.out.println("four card");
		} else if(isFullHouse(map)) {
			System.out.println("full house");
		} else if(isStraight(map)) {
			System.out.println("straight");
		} else if(isThreeCard(map)) {
			System.out.println("three card");
		} else if(isTwoPair(map)) {
			System.out.println("two pair");
		} else if(isOnePair(map)) {
			System.out.println("one pair");
		} else {
			System.out.println("null");
		}
	}

	private static boolean isOnePair(TreeMap<Integer, Integer> map) {
		if(map.containsValue(2)) return true;
		return false;
	}

	private static boolean isTwoPair(TreeMap<Integer, Integer> map) {
		int pairNum = 0;
		for(Integer value : map.keySet()) {
			if(map.get(value) == 2) pairNum++;
		}
		if(pairNum == 2) return true;
		return false;
	}

	private static boolean isThreeCard(TreeMap<Integer, Integer> map) {
		if(map.containsValue(3)) return true;
		return false;
	}

	private static boolean isStraight(TreeMap<Integer, Integer> map) {
		if(map.size() == 5) {
			int consecutiveNum = 0, lastNum = 0;
			for(Integer value : map.keySet()) {
				if(value == lastNum + 1) {
					consecutiveNum++;
					if(consecutiveNum == 4 && value == 13) {
						if(map.containsKey(1)) consecutiveNum++;
					}
				} else {
					consecutiveNum = 1;
				}
				lastNum = value;
			}
			if(consecutiveNum == 5) return true;
		}
		return false;
	}

	private static boolean isFullHouse(TreeMap<Integer, Integer> map) {
		if(map.containsValue(3) && map.containsValue(2)) return true;
		return false;
	}

	public static boolean isFourCard(TreeMap<Integer, Integer> map) {
		if(map.containsValue(4)) return true;
		return false;
	}
}

