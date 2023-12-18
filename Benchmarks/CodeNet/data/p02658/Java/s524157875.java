import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		long b = scan.nextLong();
		int nn = 0;
		if(b == 0) {
			System.out.print(0);
		}
		else {
			for(long i=1;i<a;i++) {
				long c = scan.nextLong();
				if(c == 0) {
					System.out.print(0);
				}
				else {
					b = b*c;
					
				}
			}
			if(b>1000000000000000000L) {
				System.out.print(-1);
			}
			System.out.print(b);
		}
		
	}

}