
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = scan.nextInt();
		}
		
		int count = 0;
		outside: do {
			for (int i = 0; i < list.length; i++) {
				if (list[i] % 2 == 1) {
					break outside;
				}
				list[i] /= 2;
			}
			count++;
		} while(true);
		
		System.out.println(count);
	}
}
