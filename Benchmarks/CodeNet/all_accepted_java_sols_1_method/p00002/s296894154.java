
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (stdIn.hasNextInt()) {
			int n = stdIn.nextInt();
			int i = stdIn.nextInt();
			int cou = 0;
			int ni=n+i;
			while(ni>0){
				ni/=10;
				cou++;
			}
			System.out.println(cou);
		}
	}
}