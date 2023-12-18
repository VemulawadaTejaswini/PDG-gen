import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] list = scanner.nextLine().split(" ");
		System.out.println(searchMin(list) + " " + searchMax(list) + " " + sum(list));
	}

	static int searchMin(String[] list) {
		int min = 1000000;
		for (int i = 0; i < list.length; i++) {
			if (min > Integer.parseInt(list[i])) {
				min = Integer.parseInt(list[i]);
			}
		}
		return min;
	}

	static int searchMax(String[] list) {
		int max = 0;
		for (int i = 0; i < list.length; i++) {
			if (max < Integer.parseInt(list[i])) {
				max = Integer.parseInt(list[i]);
			}
		}
		return max;
	}

	static int sum(String[] list) {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum = sum + Integer.parseInt(list[i]);
		}
		return sum;
	}
}