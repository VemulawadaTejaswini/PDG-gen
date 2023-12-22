import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int S = scanner.nextInt();
		System.out.println(S/3600 + ":" + S/60%60 + ":" + S%60);
		scanner.close();
	}
}