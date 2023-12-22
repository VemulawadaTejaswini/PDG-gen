import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int sum = 0;
			for(int i = 0; i < 5; i++) {
				int tmp = sc.nextInt();
				sum += tmp<40?40:tmp;
			}
			System.out.println(sum/5);
		}
	}
}
