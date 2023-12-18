import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void printArray(String[] cardSort) {
		for (int i = 0; i < cardSort.length; i++) {
			System.out.print(cardSort[i]);

			if (i == cardSort.length - 1) {
				break;
			}
			System.out.print(" ");
		}
		System.out.println();
	}

	public static boolean isStable(String[] in, String[] out, int n){
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int k = 0; k < n; k++) {
					for(int l = k + 1; l < n; l++) {
						String inNum1 = in[i].substring(1);
						String inNum2 = in[j].substring(1);
						int intInNum1 = Integer.parseInt(inNum1);
						int intInNum2 = Integer.parseInt(inNum2);

						if(intInNum1 == intInNum2 && in[i].equals(out[l]) && in[j].equals(out[k])) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int progCardNumOfSheets = Integer.parseInt(br.readLine());

		String[] card = br.readLine().split(" ");

		String[] cardNumBubbleSort = new String[progCardNumOfSheets];
		String[] cardNumSelectionSort = new String[progCardNumOfSheets];


		for(int i = 0; i < progCardNumOfSheets; i++) {
			cardNumBubbleSort[i] = card[i];
			cardNumSelectionSort[i] = card[i];
		}

		int compareNumResult = 0;
		String compareNum1 = "";
		String compareNum2 = "";

		boolean isSortFlag = true;

		while(isSortFlag) {
			isSortFlag = false;

			for(int i = progCardNumOfSheets - 1; i > 0; i-- ) {
				compareNum1 = cardNumBubbleSort[i].substring(1);
				compareNum2 = cardNumBubbleSort[i - 1].substring(1);
				compareNumResult = compareNum1.compareTo(compareNum2);
				if(compareNumResult < 0) {
					String tmp = cardNumBubbleSort[i - 1];
					cardNumBubbleSort[i - 1] = cardNumBubbleSort[i];
					cardNumBubbleSort[i] = tmp;
					isSortFlag = true;
				}
			}
		}

		printArray(cardNumBubbleSort);

		if(isStable(cardNumBubbleSort, cardNumBubbleSort, progCardNumOfSheets)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}

		int minNum = 0;
		for(int i = 0; i < progCardNumOfSheets; i++) {
			minNum = i;

			for(int j = i; j < progCardNumOfSheets; j++) {
				compareNum1 = cardNumSelectionSort[j].substring(1);
				compareNum2 = cardNumSelectionSort[minNum].substring(1);
				compareNumResult = compareNum1.compareTo(compareNum2);
				if(compareNumResult < 0) {
					minNum = j;
				}
			}
			if(i != minNum) {
				String tmp = cardNumSelectionSort[i];
				cardNumSelectionSort[i] = cardNumSelectionSort[minNum];
				cardNumSelectionSort[minNum] = tmp;
			}
		}

		printArray(cardNumSelectionSort);

		if(isStable(cardNumSelectionSort, cardNumSelectionSort, progCardNumOfSheets)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
	}
}