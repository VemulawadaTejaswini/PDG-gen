import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		ArrayList<Integer> dataList = new ArrayList<Integer>();
		ArrayList<Integer> searchList = new ArrayList<Integer>();
		int numData, numSearch, result;
		numData = numSearch = result = 0;

		try {
			numData = stdin.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			numData = 5;
		}
		for (int i = 0; i < numData; ++i) {
			try {
				dataList.add(stdin.nextInt());
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println();
			}
		}

		try {
			numSearch = stdin.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			numSearch = 5;
		}
		for (int i = 0; i < numSearch; ++i) {
			try {
				searchList.add(stdin.nextInt());
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println();
			}
		}

		Collections.sort(dataList);
		Collections.sort(searchList);
		Integer[] data = dataList.toArray(new Integer[numData]);
		Integer[] search = searchList.toArray(new Integer[numSearch]);

		for (int i = 0; i < numSearch; ++i) {
			for (int j = 0; j < numData; ++j) {
				if (search[i] == data[j])
					++result;
				else if (search[i] < data[j])
					break;
			}
		}
		System.out.println(result);
	}
}