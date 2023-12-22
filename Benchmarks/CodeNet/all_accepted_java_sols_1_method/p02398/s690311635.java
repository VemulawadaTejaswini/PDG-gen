import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int std_list[] = new int[3];
		for (int i = 0; i < 3; i++) {
			int int_x = scanner.nextInt();
				std_list[i] = int_x;
		}
		int count = 0;
		for (int i = std_list[0]; i < std_list[1] + 1; i++) {
			if (std_list[2] % i == 0) {
				count++;
			}
		}
		System.out.println(count);
		    //System.out.print(x);
		    //String trimmed = str.trim();
	}
}
