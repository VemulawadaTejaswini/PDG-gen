import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int c = 1;
		while(true) {
			int tmp = stdIn.nextInt();
			if(tmp == 0) {
				break;
			}
			System.out.println("Case " + c++ + ": " + tmp);
		}
	}
}