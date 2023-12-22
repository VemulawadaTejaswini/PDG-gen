import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n   = Integer.parseInt(scanner.nextLine());
		int[] list = new int[n];
		int[] ans  = new int[n];

		for(int i = 0; i < n; i++) {

			list[i] = Integer.parseInt(scanner.nextLine());
			ans[i]  = list[i];

		}

		Arrays.sort(list);

		for(int i = 0; i < n; i++) {


			if(list[n - 1] != ans[i]) {

				System.out.println(list[n - 1]);

			}else{

				System.out.println(list[n - 2]);

			}

		}




	}
}
