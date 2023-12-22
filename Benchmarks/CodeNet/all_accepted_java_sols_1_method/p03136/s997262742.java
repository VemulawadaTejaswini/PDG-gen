import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int n = sc.nextInt();
		int sum =0;
		int maxL=0;
		
		for ( int i = 0; i < n ; ++ i ) {
			int L=sc.nextInt();
			sum += L ;
			maxL = Math.max ( maxL , L );
			}
			if ( maxL < sum - maxL ) {
			 System.out.println("Yes");
			}
			else {
			System.out.println("No");
			}
	}
}