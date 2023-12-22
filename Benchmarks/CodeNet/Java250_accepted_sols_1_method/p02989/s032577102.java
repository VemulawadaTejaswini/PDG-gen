import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		String[] temp = scanner.nextLine().split(" ");
		int[] list = new int[n];

		for(int i = 0; i < n; i++) {

			list[i] = Integer.parseInt(temp[i]);

		}

		Arrays.sort(list);



		int a = list[n / 2];
		int b = list[n / 2 - 1];

		System.out.println(a - b);


	}
}
