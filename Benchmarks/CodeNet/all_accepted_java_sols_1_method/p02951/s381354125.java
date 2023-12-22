import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(c<(a-b)) {
			System.out.println(0);
		}else {
			System.out.println(c-(a-b));
		}
	}

}
