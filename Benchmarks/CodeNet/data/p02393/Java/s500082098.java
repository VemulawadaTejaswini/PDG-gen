
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intArray = new int[3];
		intArray[0] =sc.nextInt();
		intArray[1] = sc.nextInt();
		intArray[2] = sc.nextInt();
		Arrays.sort(intArray);
		System.out.print(intArray[0] + " " + intArray[1] + " " + intArray[2]);
	}
}
