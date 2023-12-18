import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		long b = scan.nextLong();
		for(long i=1;i<a;i++) {
			
			long c = scan.nextLong();
			b = b*c;
		}
		if(b>1000000000000000000L) {
			System.out.print("-1");
		}
		else {
			System.out.print(b);
		}
	}

}