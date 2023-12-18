
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		int x = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			if(S.substring(i, i + 1).equals("I")) {
				x++;
				if(x > max) {
					max = x;
				}
			} else if(S.substring(i, i + 1).equals("D")) {
				x--;
			}
		}
		System.out.println(max);
		scan.close();
	}

}
