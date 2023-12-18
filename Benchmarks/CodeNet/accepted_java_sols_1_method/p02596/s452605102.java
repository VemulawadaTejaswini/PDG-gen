import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long k = scan.nextLong();
		scan.close();
		long base = 7;
		boolean fg=false;

		for(int i=1;i<=k;i++) {

			if(base%k == 0) {
				fg = true;
				System.out.println(i);
				break;
			}
			base = (base*10 + 7)%k;
		}
		if(!fg) {
			System.out.println(-1);
		}
	}
}