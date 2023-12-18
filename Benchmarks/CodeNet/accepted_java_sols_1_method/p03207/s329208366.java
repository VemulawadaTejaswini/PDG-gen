import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        //購入商品N個
		int N = sc.nextInt();
		int maxP =0;
		int sum = 0;
		for(int i=0; i<N; i++) {
			int P = sc.nextInt();
			//Pを合計する
			sum +=P;;
			//Pの最大値を出す
			maxP = Math.max(maxP, P);
		}
           //最大値を半額にする
		  int halfMaxP=maxP/2;
      	  //合計値から最大値を引いて、最大の半額分を足す
		  System.out.println((sum-maxP)+halfMaxP);
	}
}