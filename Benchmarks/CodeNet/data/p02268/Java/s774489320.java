import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void printArray (List<Integer> list){
		StringBuilder sb = new StringBuilder();
		sb.append(list.get(0));
		for (int i = 1; i < list.size();i++) {
			sb.append(" ").append(list.get(i));
		}
		System.out.println(sb.toString());
	}



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

	public static List<List<Integer>> acceptNArray (InputStream ins) {
		Scanner sc = new Scanner(ins);
		int sNum = sc.nextInt();
		List<Integer> sArrays = new ArrayList<Integer>();
		for (int i = 0; i < sNum; i++) {
			sArrays.add(sc.nextInt());
		}
		List<Integer> qArrays = new ArrayList<Integer>();
		int qNum = sc.nextInt();
		for (int i = 0; i < qNum; i++) {
			qArrays.add(sc.nextInt());
		}
		return Arrays.asList(sArrays, qArrays);
	}

	public static void main(String[] args) {
		List<List<Integer>> arrays = acceptNArray(System.in);
		int howMany = howManyIncluded(arrays.get(0), arrays.get(1));
		System.out.println(howMany);

	}
}