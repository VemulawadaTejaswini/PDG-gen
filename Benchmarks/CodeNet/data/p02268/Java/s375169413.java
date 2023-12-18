import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] s = getArray(n);
		int q = sc.nextInt();
		int[] t = getArray(q);
		sc.close();
		Integer sameNumCount = 0;
		for(int tValue: t) {
			binarySearch(tValue, s, sameNumCount);
		}
		System.out.println(sameNumCount);
	}
	public static int[] getArray(int valueNum) {
		int array[] = new int[valueNum];
		for(int i = 0; i < valueNum; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}
	public static void binarySearch(int target, int[] array, Integer sameNumCount) {
		int left = 0;
		int right = array.length;
		while(left < right) {
			int middle = (left + right) / 2;
			if(target == array[middle]) {
				sameNumCount++;
				break;
			} else if(target < array[middle]) {
				right = middle;
			} else {
				left = middle + 1;
			}
		}
	}

}