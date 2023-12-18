
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		String week[] = {"sat","sun","mon","tue","wed","thu","fri"};
		x = x-9;
		if(x > 0) {
			int a = x%7;
			System.out.println(week[a]);
		}else {
			int a = (x+14)%7;
			System.out.println(week[a]);
		}
	}
}

