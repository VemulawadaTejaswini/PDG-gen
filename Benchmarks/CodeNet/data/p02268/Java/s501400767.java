import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static boolean binSearchRecursive(List<Integer> array, int b, int e, int value){

		if (e - b == 1) {
			// no diff
			if (array.get(e) == value) {
				return true;
			}
			if (array.get(b) == value) {
				return true;
			}
			return false;
		}
		int middle = (b + e)/ 2;
		int midVal = array.get(middle);
		if (midVal <  value) {
			// right search
			return binSearchRecursive(array, middle, e, value);
		} else if (midVal > value) {
			// left search
			return  binSearchRecursive(array, b, middle, value);
		}
		return  true;
	}

	public static int howManyIncluded (List<Integer> qArray, List<Integer> sArray) {

		int howMany = 0;
		for (int i = 0; i < sArray.size(); i++) {
			if (binSearchRecursive(qArray, 0, sArray.size(), sArray.get(i))) {
				howMany++;
			}
		}

		return  howMany;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sNum = sc.nextInt();
		List<Integer> sArray = new ArrayList<Integer>();
		for (int i = 0; i < sNum; i++) {
			sArray.add(sc.nextInt());
		}
		List<Integer> tArray = new ArrayList<Integer>();
		int tNum = sc.nextInt();
		for (int i = 0; i < tNum; i++) {
			tArray.add(sc.nextInt());
		}
		int howMany = howManyIncluded(sArray, tArray);
		System.out.println(howMany);
	}
}