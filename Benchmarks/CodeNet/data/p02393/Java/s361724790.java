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
		int[] arr2 = Sort(arr);
		
		String text = "";
		for (int i : arr2) {
			text += String.valueOf(i) + " ";
		}
		
		System.out.print(text);
	}

	public static int[] Sort(int[] arr) {
		int[] sortArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			sortArr[i] = arr[arr.length-1-i];
		}
		return sortArr;
	}

}