import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long n=scan.nextLong();
		for(long i=n;;i--) {
			if(Math.sqrt((double)i) ==(int)Math.sqrt((double)i)) {
				System.out.println(i);
				break;
			}
		}
	}

}
