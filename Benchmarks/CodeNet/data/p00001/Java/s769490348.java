import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int height[] = new int[10];
		int first = -1, second = -1, third = -1;
		
		for (int i = 0; i < 10; i++) {
			height[i] = scanner.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (first == -1 || height[first] < height[i]) {
				third = second;
				second = first;
				first = i;
			}
		}
		for (int i = 0; i < 10; i++) {
			if ((i != first) && (second == -1 || height[second] < height[i])) {
				third = second;
				second = i;
			}
		}
		for (int i = 0; i < 10; i++) {
			if ((i != first) && (i != second) && (third == -1 || height[third] < height[i])) {
				third = i;
			}
		}
		System.out.println(height[first]);
		System.out.println(height[second]);
		System.out.println(height[third]);
	}
}