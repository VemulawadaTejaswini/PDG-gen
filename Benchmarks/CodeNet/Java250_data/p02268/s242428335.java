import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[4];
		for(int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine();
		}
		sc.close();
		int lenSort = Integer.parseInt(str[0]);
		int[] sorted = stringToIntArray(str[1], lenSort);
		int lenUn = Integer.parseInt(str[2]);
		int[] unsorted = stringToIntArray(str[3], lenUn);
		if (sortedCheck(sorted)) {
			int n = 0;
			for(int u: unsorted) {
				if (binarySearch(sorted, u, 0, sorted.length - 1) > 0) {
					n++;
				}
			}
			System.out.println(n);
		}
	}
	
	public static boolean sortedCheck(int[] nums) {
		int n = nums[0];
		for(int i: nums) {
			if(n <= i) {
				n = i;
			}
			else return false;
		}
		return true;
	}
	
	public static int[] stringToIntArray(String str, int len) {
		String[] strings = str.split(" ", len);
		int[] nums = new int[strings.length];
		for(int i = 0; i < strings.length; i++) {
			nums[i] = Integer.parseInt(strings[i]);
		}
		return nums;
	}
	
	public static int binarySearch(int[] sorted, int x, int start, int end) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (sorted[mid] == x)
				return 1;
			else if (sorted[mid] > x)
				return binarySearch(sorted, x, start, mid - 1);
			else
				return binarySearch(sorted, x, mid + 1, end);
		}
		return -1;
	}
}

