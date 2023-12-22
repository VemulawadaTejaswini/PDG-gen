import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		long k = scan.nextLong();

		long re = 0L;

		if(k <= a) {
			re = k;
			}else if(k <= (a+b)) {
	re = a;
			}else {
	re = a-(k-a-b);
			}
		System.out.println(re);
		scan.close();
	}

}
