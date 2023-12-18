import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		Scanner scan;
		while(true) {
			i++;
			scan = new Scanner(System.in);
			int a = scan.nextInt();
			if(a == 0) {
				break;
			}
			System.out.println("Case " + i + ": " + a);
		}
		scan.close();
	}
}
