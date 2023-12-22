import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		int largest = 0;
		int secondlargest = 0;
		int thirdlargest = 0;
		int largestindex = 0;
		int secondlargestindex = 0;
		int[] number = new int[10];
		for (int i = 0; i <= 9; i++) {
			number[i] = input1.nextInt();
		}
		for (int i = 0; i <= 9; i++) {
			if (number[i] > largest) {
				largest = number[i];
				largestindex = i;
			}
		}
		for (int i = 0; i <= 9; i++) {
			if (number[i] > secondlargest && i != largestindex) {
				secondlargest = number[i];
				secondlargestindex = i;
			}
		}
		for (int i = 0; i <= 9; i++) {
			if (number[i] > thirdlargest && i != largestindex && i != secondlargestindex) {
				thirdlargest = number[i];
			}
		}
		
		System.out.println(largest);
		System.out.println(secondlargest);
		System.out.println(thirdlargest);
	}

}