import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = scanner.nextInt();
		while (sum > 0){
			for (int i = 0; i < 9; i++){
				sum -= scanner.nextInt();
			}
			System.out.println(sum);
			sum = scanner.nextInt();
		}
	}
}

