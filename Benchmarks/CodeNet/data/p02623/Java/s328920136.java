import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lengthFirst = scanner.nextInt();
		int lengthSecond = scanner.nextInt();
		int maximum = scanner.nextInt();
		int[] books1 = new int[lengthFirst];
		int[] books2 = new int[lengthSecond];
		
		for(int i = 0; i < lengthFirst; i++)
			books1[i] = scanner.nextInt();
		for(int i = 0; i < lengthSecond; i++)
			books2[i] = scanner.nextInt();
		
		long[] sum = new long[lengthFirst];
		sum[0] = books1[0];
		int nums1 = 0;
		if(sum[0] > maximum)
			nums1--;	
		
		
		for(int i = 1; i < lengthFirst; i++) {
			sum[i] = sum[i - 1] + books1[i];
			if(sum[i] > maximum)
				break;
			nums1++;
		}
		long[] sum2 = new long[lengthSecond];
		sum2[0] = books2[0];
		int nums2 = 0;
		if(sum2[0] > maximum)
			nums2--;	
		for(int i = 1; i < lengthSecond; i++) {
			sum2[i] = sum2[i - 1] + books2[i];
			if(sum2[i] > maximum)
				break;
			nums2++;
		}
		int result = Math.max(nums2 + 1, nums1 + 1);
		int temporal = nums2;
		for(int i = 0; i <= nums1; i++) {
			int temporal2 = temporal;
			for(int j = temporal; j >= 0; j--) {
				if(sum[i] + sum2[j] > maximum) {
					temporal2--;
				}
				else {
					result = Math.max(result, j + i + 2);
					break;
				}
			}
			temporal = temporal2;
		}
		
		System.out.println(result);
	}

}
