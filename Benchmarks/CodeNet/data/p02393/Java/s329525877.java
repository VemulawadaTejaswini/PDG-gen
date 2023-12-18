import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[] arr = { a, b, c };
//		int[] sortArr = new int[arr.length];
//		
//		for (int i = 0; i < arr.length; i++) {
//			sortArr[i] = arr[arr.length - 1 - i];
//		}
//		System.out.println(sortArr[0] + " " + sortArr[1] + " " + sortArr[2]);
		System.out.println(arr[2] + " " + arr[1] + " " + arr[0]);
		
	}

}