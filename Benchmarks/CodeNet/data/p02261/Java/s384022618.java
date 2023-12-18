import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void printArray(String[] cardNumBubbleSort){
		for (int i = 0; i < cardNumBubbleSort.length; i++){
			System.out.print(cardNumBubbleSort[i]);

			if (i == cardNumBubbleSort.length - 1){
				break;
			}
			System.out.print(" ");
		}
		System.out.println();
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
		int compareStrResult = 0;
		String compareNum1 = "";
		String compareNum2 = "";
		String compareStr1 = "";
		String compareStr2 = "";
		int sortCount = 0;
		String compareJudge= "Stable";

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
					sortCount++;
				}
			}
		}
		if(sortCount != 0) {
			for(int i = progCardNumOfSheets - 1; i > 0; i-- ) {
				compareNum1 = cardNumBubbleSort[i].substring(1);
				compareNum2 = cardNumBubbleSort[i - 1].substring(1);
				compareStr1 = cardNumBubbleSort[i].substring(0);
				compareStr2 = cardNumBubbleSort[i - 1].substring(0);

				if(compareNum1.equals(compareNum2)) {
					compareStrResult = compareStr1.compareTo(compareStr2);

					if(compareStrResult < 0) {
						compareJudge = "Not stable";
					}
				}
			}
		}
		printArray(cardNumBubbleSort);
		System.out.println(compareJudge);

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
				sortCount++;
			}
		}
		if(sortCount != 0) {
			for(int i = progCardNumOfSheets - 1; i > 0; i-- ) {
				compareNum1 = cardNumSelectionSort[i].substring(1);
				compareNum2 = cardNumSelectionSort[i - 1].substring(1);
				compareStr1 = cardNumSelectionSort[i].substring(0);
				compareStr2 = cardNumSelectionSort[i - 1].substring(0);

				if(compareNum1.equals(compareNum2)) {
					compareStrResult = compareStr1.compareTo(compareStr2);

					if(compareStrResult < 0) {
						compareJudge = "Not stable";
					}
				}
			}
		}
		printArray(cardNumSelectionSort);
		System.out.println(compareJudge);
	}
}