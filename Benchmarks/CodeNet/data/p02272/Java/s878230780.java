import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static int count = 0;

	public static void merge(List<Integer> numbers, int left, int mid, int right) {
		int num1 = mid - left;
		int num2 = right - mid;
		int[] leftArray = new int[num1+1];
		int[] rightArray = new int[num2+1];

		for(int i = 0; i < num1; i++) {
			leftArray[i] = numbers.get(left+i);
		}
		for(int i = 0; i < num2; i++) {
			rightArray[i] = numbers.get(mid+i);
		}
		leftArray[num1] = Integer.MAX_VALUE;
		rightArray[num2] = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;
		for(int k = left; k < right; k++, count++) {
			if(leftArray[i] <= rightArray[j]) {
				numbers.set(k, leftArray[i]);
				i++;
			} else {
				numbers.set(k, rightArray[j]);
				j++;
			}

		}
	}

	public static void mergeSort(List<Integer> numbers, int left, int right) {
		if(left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(numbers, left, mid);
			mergeSort(numbers, mid, right);
			merge(numbers, left, mid, right);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();

		// 入力を受け取る
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			numbers.add(scan.nextInt());
		}

		// マージソートを行う
		mergeSort(numbers, 0, num);


		// 結果を出力する
		for(int i = 0; i < num; i++) {
			if(i == 0) {
				System.out.print(numbers.get(i));
			} else {
				System.out.print(" " + numbers.get(i));
			}
		}
		System.out.println("");
		System.out.println(count);
	}
}

