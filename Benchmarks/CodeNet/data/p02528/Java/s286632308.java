

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] num = new int[count];
		for (int i = 0; i < count; i++) {
			num[i] = scan.nextInt();
		}
		bubbleSort(num,count);
		
	}

	public static void bubbleSort(int[] num, int count) {
		for(int i = 0;i < count;i++) {
			for(int j = 0;j < count - 1;j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j + 1];
					num[j + 1] = num[j];
					num[j] = temp;
				}
			}
		}
		for (int i = 0;i < count - 1;i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println(num[num.length - 1]);
	}

}