import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		sc.close();

		int arr[] = {a, b, c};
		Arrays.sort(arr);

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length-1) System.out.print(" ");
		}
		System.out.println("");

	}

}
