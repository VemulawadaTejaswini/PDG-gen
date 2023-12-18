import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] cards = new String[n];
		for(int arrayIndex = 0; arrayIndex < n; arrayIndex++) {
			cards[arrayIndex] = sc.next();
		}
		sc.close();
		List<List<String>> sameCardPairs = makeSamePairs(cards);
		String sortIsStable = "Not stable";
		String[] sortCards = copyArray(cards);
		for(int i = 0; i < n; i++) {
			for(int j = n - 1; j > i; j--) {
				int cardJNumber = cardToNumber(sortCards[j]);
				int cardJMinus1Number = cardToNumber(sortCards[j - 1]);
				if(cardJNumber < cardJMinus1Number) {
					arrayValueSwap(sortCards, j, j - 1);
				}
			}
		}
		if(isStable(sameCardPairs, sortCards)) {
			sortIsStable = "Stable";
		}
		printArray(sortCards);
		System.out.println(sortIsStable);

		sortCards = copyArray(cards);
		for(int i = 0; i < n; i++) {
			int minJ = i;
			for(int j = i; j < n; j++) {
				int cardJNum = cardToNumber(sortCards[j]);
				int cardMinJNum = cardToNumber(sortCards[minJ]);
				if(cardJNum < cardMinJNum) {
					minJ = j;
				}
			}
			arrayValueSwap(sortCards, i, minJ);
		}
		if(isStable(sameCardPairs, sortCards)) {
			sortIsStable = "Stable";
		} else {
			sortIsStable = "Not stable";
		}
		printArray(sortCards);
		System.out.println(sortIsStable);

	}
	public static void printArray(String[] array) {
		int arrayLength = array.length;
		for(int index = 0; index < arrayLength - 1; index++) {
			System.out.print(array[index] + " ");
		}
		System.out.println(array[arrayLength - 1]);
	}
	public static String[] copyArray(String[] originalArray) {
		int arrayLength = originalArray.length;
		String[] copyArray = new String[arrayLength];
		System.arraycopy(originalArray, 0, copyArray, 0, arrayLength);
		return copyArray;
	}
	public static int cardToNumber(String card) {
		return Integer.parseInt(card.split("")[1]);
	}
	public static void arrayValueSwap(String[] swapArray, int index1, int index2) {
		String work = swapArray[index1];
		swapArray[index1] = swapArray[index2];
		swapArray[index2] = work;
	}
	public static List<List<String>> makeSamePairs(String[] originalArray) {
		List<List<String>> sameCardPairs = new ArrayList<>();
		String[] copyArray = copyArray(originalArray);
		int arrayLength = copyArray.length;
		for(int i = 0; i < arrayLength; i++) {
			String nowCard = copyArray[i];
			if(nowCard != null) {
				List<String> sameCardPair = new ArrayList<>();
				int nowCardNum = cardToNumber(nowCard);
				for(int j = 0; j < arrayLength; j++) {
					String compareCard = copyArray[j];
					if(compareCard != null) {
						int compareCardNum = cardToNumber(compareCard);
						if(nowCardNum == compareCardNum) {
							sameCardPair.add(compareCard);
							copyArray[j] = null;
						}
					} else {
						continue;
					}
				}
				if(sameCardPair.size() >= 2) {
					sameCardPairs.add(sameCardPair);
				}
			} else {
				continue;
			}
		}
		return sameCardPairs;
	}
	public static boolean isStable(List<List<String>> sameCardPairs, String[] sortArray) {
		for(List<String> sameCardList: sameCardPairs) {
			List<Integer> sameNumCardIndexs = new ArrayList<>();
			for(String card: sameCardList) {
				for(int i = 0; i < sortArray.length; i++) {
					if(sortArray[i].equals(card)) {
						sameNumCardIndexs.add(i);
					}
				}
				for(int i = 1; i < sameNumCardIndexs.size(); i++) {
					if(sameNumCardIndexs.get(i) - sameNumCardIndexs.get(i - 1) < 0) {
						return false;
					}
				}
			}
		}
		return true;
	}
}