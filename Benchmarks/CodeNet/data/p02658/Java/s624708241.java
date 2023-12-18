import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		long b = scan.nextLong();
		int nn = 0;
		for(long i=1;i<a;i++) {
			
			long c = scan.nextLong();
			b = b*c;
		}
		if(b>1000000000000000000L) {
			System.out.print(nn);
		}
		else {
			System.out.print(b);
		}
	}

}