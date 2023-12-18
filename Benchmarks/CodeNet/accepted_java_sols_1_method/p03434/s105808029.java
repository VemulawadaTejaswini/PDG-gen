import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfSheets = sc.nextInt();
		int[] numArray = new int[numOfSheets];
		for(int i = 0; i < numOfSheets; i++) {
			numArray[i] = sc.nextInt();
		}
		int[] sortArray = new int[numArray.length];
		int Alice = 0;
		int Bob = 0;
		for (int i = 0; i < numArray.length; i++) {
			int placeNum = 0;
			sortArray[i] = 0;
			for (int j = 0; j < sortArray.length; j++) {
				if(sortArray[i] < numArray[j]) {
					sortArray[i] = numArray[j];
					placeNum = j;
				}
			}
			numArray[placeNum] = 0;
			if(i % 2 == 0) {
				Alice += sortArray[i];
			}else {
				Bob += sortArray[i];
			}
		}
		System.out.print(Alice - Bob);
	}
}
