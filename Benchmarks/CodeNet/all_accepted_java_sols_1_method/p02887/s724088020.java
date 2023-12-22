import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		int n = Integer.parseInt(scanner.nextLine());

		char[] list = scanner.nextLine().toCharArray();

		int count = 0;

		for(int i = 0; i < n; i++) {

			for(int j = i + 1; j < n && list[i] == list[j]; j++) {

				i ++;
			}

			count++;

		}
		System.out.println(count);
	}
}