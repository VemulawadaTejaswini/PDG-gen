import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int intA = sc.nextInt();
		int intB = sc.nextInt();
		int intC = sc.nextInt();

		int[] arr = new int[]{intA,intB,intC};
		Arrays.sort(arr);

		System.out.print(arr[0] + " " + arr[1] + " " + arr[2]);
	}
}