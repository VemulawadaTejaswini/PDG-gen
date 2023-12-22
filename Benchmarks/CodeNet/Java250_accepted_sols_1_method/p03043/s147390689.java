
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());//int型
		int K = Integer.parseInt(sc.next());
		double ans = 0;
		// サイコロの段階で勝ち確定
		ans = Math.max((double)(N-K+1)/N, 0);
		int co=0;
		if(N<K) co = N;
		else if(N>=K) co=K-1;
		
		for( int i=1; i<=co;i++) {
			int countpow=0;
			for(int j=1; j<18;j++){
			    int p = (int) (i*Math.pow(2, j));
				if(p>=K) {
					countpow=j;
					break;
				}
			}
			double tmp=(double)1/(N * Math.pow(2, countpow));
			ans += tmp;
			
		}
		
		System.out.println(String.format("%.12f",ans));
		
	}

}
