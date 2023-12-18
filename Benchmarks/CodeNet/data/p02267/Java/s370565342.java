import java.util.Scanner;

public class Main {
	public static int linearSearch(int[] sArray, int[] qArray) {
		int matches = 0;
		for (int i=0; i < qArray.length; i++) {
			int qry = qArray[i];
			for (int j = 0; j < sArray.length; j++) {
				if (sArray[j] == qry) {
					matches++;
					break;
				} } }
		return matches;
	}
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int srchSize = scnr.nextInt();
		int[] srchArray = new int[srchSize];
		for (int i=0; i<srchSize; i++) {
			srchArray[i] = scnr.nextInt();
		}
		
		int qrySize = scnr.nextInt();
		int[] qryArray = new int[qrySize];
		for (int i=0; i<qrySize; i++) {
			qryArray[i] = scnr.nextInt();
		}
		
		System.out.println(linearSearch(srchArray, qryArray));		
	}

}

