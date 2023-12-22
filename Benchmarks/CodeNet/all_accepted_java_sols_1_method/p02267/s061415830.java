import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int length1 = scanner.nextInt();
		int[] arr1 = new int[length1];

		for (int i = 0; i < length1; i++) {
			arr1[i] = scanner.nextInt();
		}

		int length2 = scanner.nextInt();
		int[] arr2 = new int[length2];

		for (int i = 0; i < length2; i++) {
			arr2[i] = scanner.nextInt();
		}

		// Linear Search
		int count = 0;
		boolean cont = true;
		for (int i = 0; i < length2; i++) {
			cont = true;
			for (int j = 0; j < length1; j++) {
				if (arr2[i] == arr1[j]&& cont) {
					cont = false;
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
