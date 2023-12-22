
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;n>1000;i++) {
		n = n % 1000;

		}

		if(n==0) {
			System.out.println(n);
		}else if(n!=0) {
			n = 1000-n;
			System.out.println(n);
		}

	}

}
