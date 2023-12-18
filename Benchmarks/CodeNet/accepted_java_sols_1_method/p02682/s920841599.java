import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int num;
		if(k - a > 0) {
			num = a;
			if(k - a - b > 0) {
				num-=(k-a-b);
			}
		}else {
			num = k;
		}
		System.out.println(num);
		sc.close();
	}
}
