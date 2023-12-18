import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int last = n%10;
		switch (last) {
			case 0:
			case 1:
			case 6:
			case 8:
				System.out.println("pon");
				return;
			case 2:
			case 4:
			case 5:
			case 7:
			case 9:
				System.out.println("hon");
				return;
			default:
				System.out.println("bon");
				return;
		}
	}

}
