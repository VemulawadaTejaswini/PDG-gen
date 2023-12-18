import java.util.Scanner;

public class Main {
	public static void main(String argv[]) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int array[] = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = in.nextInt();
		}
		print(array);
		
		int reference, next;
		
		for (int j = 1; j < length; j++) {
			reference = j - 1;
			next = array[j];
			while (next >= 0 && array[reference] > next) {
				array[reference + 1] = array[reference];
				reference--;
			}
			array[reference+1] = next;
			print(array);
		}
		
	}
	public static void print(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println("/n");
	}
}

