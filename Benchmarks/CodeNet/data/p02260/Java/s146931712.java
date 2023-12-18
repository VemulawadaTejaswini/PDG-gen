import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void printArray(int[] intArray){
		for (int i = 0; i < intArray.length; i++){
			System.out.print(intArray[i]);

			if (i == intArray.length - 1){
				break;
			}
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int progNumLength = Integer.parseInt(br.readLine());

		String[] progNum = br.readLine().split(" ");

		int[] progNumResult = new int[progNumLength];

		for(int i = 0; i < progNumLength; i++) {
			progNumResult[i] = Integer.parseInt(progNum[i]);
		}

		int minNum = 0;
		int sortCount = 0;
		for(int i = 0; i < progNumLength; i++) {
			minNum = i;

			for(int j = i; j < progNumLength; j++) {
				if(progNumResult[j] < progNumResult[minNum]) {
					minNum = j;
				}
			}
			if(i != minNum) {
				int tmp = progNumResult[i];
				progNumResult[i] = progNumResult[minNum];
				progNumResult[minNum] = tmp;

				sortCount++;
			}
		}
		printArray(progNumResult);
		System.out.println(sortCount);
	}

}