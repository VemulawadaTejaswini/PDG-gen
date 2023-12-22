import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();

		int cnt = 1;
		int sum = 0;
		for ( int i = 0; i < n; i++ ) {			
			sum += in.nextInt();
			if ( x < sum ) break;			
			cnt++;
		}

		System.out.println(cnt);
		in.close();
	}
}