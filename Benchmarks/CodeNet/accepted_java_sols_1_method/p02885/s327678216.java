import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int yoko = scan.nextInt();
		int curtain = scan.nextInt();
		int re = yoko-curtain*2;

		System.out.println(re <= 0?0:re);

		scan.close();

	}

}
