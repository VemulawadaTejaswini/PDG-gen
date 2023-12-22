import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int  N = sc.nextInt();
		int p[] = new int[N+1] ;

		int ngPos = 0 ;
		int ngNum = 0 ;
		int changeCount = 0 ;
		boolean ok = true ;
		for( int i = 1 ; i <= N; i ++ ) {
			p[i] = sc.nextInt();
			if(p[i] != i ) {
				if(0 < changeCount) {
					ok = false ;
					break ;
				}
				if(0 == ngPos) {
					ngPos = i ;
					ngNum = p[i];
				}else {
					if(ngPos == p[i] && ngNum == i) {
						changeCount ++ ;
						ngPos = 0 ;
						ngNum = 0 ;
					}else {
						ok = false ;
						break ;
					}
				}
			}
		}
		if(ok) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
