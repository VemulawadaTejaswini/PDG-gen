import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int arrayIndex = 0; arrayIndex < n; arrayIndex++) {
			nums[arrayIndex] = sc.nextInt();
		}
		boolean flag = true;
		int swapCount = 0;
		while(flag) {
			flag = false;
			for(int j = n - 1; j > 0; j--) {
				if(nums[j] < nums[j - 1]) {
					int work = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = work;
					flag = true;
					swapCount++;
				}
			}
		}
		printArray(nums);
		System.out.println(swapCount);
	}
	public static void printArray(int[] array) {
		int arrayLength = array.length;
		for(int index = 0; index < arrayLength - 1; index++) {
			System.out.print(array[index] + " ");
		}
		System.out.println(array[arrayLength - 1]);
	}
}