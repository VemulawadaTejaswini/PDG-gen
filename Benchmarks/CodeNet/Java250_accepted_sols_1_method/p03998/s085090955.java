
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[];
		int p[];
		
		p = new int[3];
		a = new String[3];
		
		for(int i = 0; i < 3; ++i) {
			a[i] = sc.nextLine();
			p[i] = 0;
		}
		
		int turn = 0;
		int win = turn;
		
		while(p[turn] != a[turn].length()) {
			++p[turn];
			turn = a[turn].charAt(p[turn] - 1) - 'a';
			win = turn;
		}
		
		System.out.println((char)(win + 'A'));
		
		sc.close();
	}

}
