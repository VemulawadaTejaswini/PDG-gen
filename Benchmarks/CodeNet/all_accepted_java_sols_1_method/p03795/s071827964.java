
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int eatNum = scan.nextInt();
		int eatFee = eatNum * 800;
		int waribiki = (eatNum / 15) * 200;
		System.out.println(eatFee - waribiki);
	}

}
