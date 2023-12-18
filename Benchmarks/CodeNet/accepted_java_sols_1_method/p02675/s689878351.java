import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String ans = "";
		switch (n % 10) {
		case 2:
		case 4:
		case 5:
		case 7:
		case 9:
			ans = "hon";
			break;
		case 0:
		case 1:
		case 6:
		case 8:
			ans = "pon";
			break;
		default:
			ans = "bon";
			break;
		}
		System.out.println(ans);
	}
}
