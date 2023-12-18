import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new java.util.Scanner(System.in);
		int[] array = new int[10];





		
		for(int i = 0; i < 10; i++){
			array[i] = scanner.nextInt();
		}


		Arrays.sort(array);

		System.out.println(array[9]);
		System.out.println(array[8]);
		System.out.println(array[7]);


	}
}