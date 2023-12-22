import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
//	入力の読み込み
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();  //目標金額
		long total = 100L;  //預金金額
		int count = 0;  //何年後か
//	totalがxを超えるまで繰り返す
		while(total < x) {
			total *= 1.01;
			count++;  //何年たったかカウントする
		}
		System.out.print(count);
	}
}
