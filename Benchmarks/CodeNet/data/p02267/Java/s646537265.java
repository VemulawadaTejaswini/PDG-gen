import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main binarySearch = new Main();
		Scanner input = new Scanner(System.in);
		int[] integers = new int[input.nextInt()];
		input.nextLine();
		integers = binarySearch.nextLineToIntArray(input.nextLine(), integers);
		int[] queries = new int[input.nextInt()];
		input.nextLine();
		queries = binarySearch.nextLineToIntArray(input.nextLine(), queries);
		ArrayList<int[]> unsortedArrays = new ArrayList<int[]>();
		unsortedArrays.add(integers);
		unsortedArrays.add(queries);
		ArrayList<int[]> sortedArrays = binarySearch.selectionSortData(unsortedArrays);
		System.out.println(binarySearch.binarySearch(sortedArrays.get(0), sortedArrays.get(1)));
	}
	
	public int[] nextLineToIntArray(String nextLine, int[] array) {
		String integerString = "";
		int arrayIndex = 0;
		int integerValue = 0;
		for (int i = 0; i < nextLine.length(); i++) {
			if (i == nextLine.length() - 1) {
				integerString = integerString + nextLine.substring(i);
			} else {
				integerString = integerString + nextLine.substring(i, i + 1);
			}
			try {
				integerValue = Integer.parseInt(integerString);
			} catch (NumberFormatException e) {
				array[arrayIndex] = integerValue;
				arrayIndex++;
				integerString = "";
			}
		}
		if (integerString != "") {
			array[array.length - 1] = integerValue; 
		}
		
		return array;
	}
	
	public int binarySearch(int[] integers, int[] queries) {
		int count = 0;
		int midpoint;
		for (int i = 0; i < queries.length; i++) {
			int high = integers.length;
			int low = 0;
			for (int j = 1; j < integers.length; j*=2) {
				midpoint = (high + low) / 2;
				if (integers[midpoint] > queries[i]) {
					high = midpoint;
				} else if (integers[midpoint] < queries[i]) {
					low = midpoint;
				} else {
					count++;
					break;
				}
			}
			
		}
		return count;
	}
	
	public ArrayList<int[]> selectionSortData(ArrayList<int[]> setData) {
		for (int i = 0; i < setData.size(); i++) {
			int[] set = setData.remove(i);
			int largestNumberIndex = -1;
			int largestNumber = -1;
			int reverseSetIndex = set.length - 1;
			for (int j = 0; j >= 0; j++) {
				int arrayValue = set[j];
				if (arrayValue > largestNumber) {
					largestNumber = arrayValue;
					largestNumberIndex = j;
				}
				if (j == reverseSetIndex) {
					set[largestNumberIndex] = set[reverseSetIndex];
					set[reverseSetIndex] = largestNumber;
					reverseSetIndex--;
					largestNumber = 0;
					j = (reverseSetIndex <= 0)? -2 : -1;
				}
			}
			setData.add(i, set);
		}
		return setData;
	}
	
}

