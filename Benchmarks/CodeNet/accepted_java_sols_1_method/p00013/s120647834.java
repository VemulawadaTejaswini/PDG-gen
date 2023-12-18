import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int size = 0;

		while (sc.hasNext()) {
			int number = sc.nextInt();
			if (number == 0) {
				System.out.println(a[size - 1]);
				size--;
			} else {
				a[size] = number;
				size++;
			}
		}
	}
}