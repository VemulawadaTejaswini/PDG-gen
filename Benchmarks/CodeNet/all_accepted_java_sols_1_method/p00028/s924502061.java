import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] inputArray = new int[100];

	while (sc.hasNextInt()) {
	    int input = sc.nextInt();
	    for (int i = 0; i < 100; i++) {
		if ((i + 1) == input) {
		    inputArray[i] = inputArray[i] + 1;
		    break;
		}
	    }
	}

	/**
	 * ?????§????????????
	 */
	int max = 0;
	for (int i = 0; i < 100; i++) {
	    max = Math.max(max, inputArray[i]);
	}

	/**
	 * ??????????????????
	 */
	for (int i = 0; i < 100; i++) {
	    if (max == inputArray[i]) {
		System.out.println(i + 1);
	    }
	}
    }
}