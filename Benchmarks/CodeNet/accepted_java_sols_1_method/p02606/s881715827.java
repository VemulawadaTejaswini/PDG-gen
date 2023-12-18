import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		int R = scan.nextInt();
		int d = scan.nextInt();
		int cnt = 0;
		for(;L <= R;L++) {
			if(L%d==0) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
	}
}