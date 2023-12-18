import java.util.Scanner;

class Main{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int std_list[] = new int[2];
		for (int i = 0; i < 2; i++) {
			int int_x = scanner.nextInt();
				std_list[i] = int_x;
		}
		System.out.printf("%d %d %f", std_list[0]/std_list[1], std_list[0]%std_list[1], (double)std_list[0]/std_list[1]);
	}
}
