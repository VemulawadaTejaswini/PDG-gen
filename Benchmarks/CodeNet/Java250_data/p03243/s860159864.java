import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		int x = Integer.parseInt(input);
		for(int i=1; i<10; i++) {
			int a = i*100+i*10+i;
			if(x<=a) {
				System.out.println(a);
				return;
			}
		}
	}
}