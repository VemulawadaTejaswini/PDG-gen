import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ARC004
		//https://arc004.contest.atcoder.jp/tasks/arc004_1
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double ans = 0;
		int T = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		ans = (double)T/(double)X;
		
		System.out.println(ans);
	}
	
}
