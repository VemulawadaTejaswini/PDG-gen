import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int origin;
		while((origin = scan.nextInt()) > 100 || origin < 0) {
			System.out.println("もう一度数字を入力してください。");
		}
		int cube = origin*origin*origin;
		System.out.println(cube);
	}
}

