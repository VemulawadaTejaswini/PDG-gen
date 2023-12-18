import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] array = new int[num];
		int count = 0;
		for (int i = 0; i < num; i++) {
			array[i]=scan.nextInt();
		}
		scan.close();
		for (int i = 0; i < num; i++) {
			
			for (int j = 2; j < array[i]; j++) {
				if (array[i] % j == 0) {
					count += 1;
					break;
				}
			}
		}
		System.out.println(num-count);


	}

}
