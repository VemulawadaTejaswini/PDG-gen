import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		Scanner scan = new Scanner(System.in);;
		while(true) {
			i++;
			int a = scan.nextInt();
			if(a == 0) {
				break;
			}
			System.out.println("Case " + i + ": " + a);
		}
		scan.close();
	}
}
