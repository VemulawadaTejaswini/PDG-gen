import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		n = n % 10;
		String yomi;
		switch (n) {
			case 3:
				yomi = "bon";
				break;
			case 0:
			case 1:
			case 6:
			case 8:
				yomi = "pon";
				break;
			default:
				yomi = "hon";
		}

		System.out.println(yomi);
	}
}
