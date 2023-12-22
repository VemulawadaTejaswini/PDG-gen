import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int [] array = new int[length];
		
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < length; i++) {

			for (int j = 0; j < i; j++) {
				if (array[j] > array[i]) {
					int temp = array[i];
					for (int k = i - 1; k >= j; k--) {
						array[k + 1] = array[k];
					}
					array[j] = temp;
				}
			}

			for (int j = 0; j < length; j++) {
				System.out.print(array[j]);
				if (j != length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}