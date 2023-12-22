import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		StringBuilder out = new StringBuilder();
		while ((size = sc.nextInt()) != 0) {
			int min = 1000001;
			int[] array = new int[size];
			for (int i = 0; i < size; i++) {
				array[i] = sc.nextInt();
			}
			int tmp;
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (i != j && min > (tmp = Math.abs(array[i] - array[j]))) {
						min = tmp;
					}
				}
			}
			out.append(min);
			out.append('\n');
		}
		System.out.print(out.toString());
	}
}

