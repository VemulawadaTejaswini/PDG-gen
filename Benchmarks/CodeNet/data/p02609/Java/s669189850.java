import java.util.Scanner;

public class Main {
	
	private static Scanner sc;
	
	public static void main (String args[]) {
		sc = new Scanner(System.in);
		//f(n)のnを取得 1<=n<=2*10^5
		int n = Integer.parseInt(sc.next());
		//xを取得 二進数でn桁の整数(topが0もありえるよ)　一旦Strで持つ　xの桁数はnと一致
		String x = sc.next();
		
		//n回回すのは確定
		for(int i = 0; i<=n-1; i++) {

			//ビット反転
			String stFirst = x.substring(0, i-1);
			String st = x.substring(i, i+1);
			String stLast = x.substring(i+1, x.length());
			String changedSt;
			if("0".equals(st)) {
				changedSt = stFirst + "1" + stLast;
			} else {
				changedSt = stFirst + "0" + stLast;
			}
			//changedStの1の数
			int countOne = countOne(changedSt);
			//10進数に変換
			int xi  = Integer.parseInt(changedSt, 2); 
			
			//f(xi)を求める
			boolean b = true;
			int result = 0;
			while (b) {
				//xiをpopcount(xi)で割る popcount(xi) = countOne
				int der = xi%countOne;
				String strTen =  Integer.toBinaryString(der);
				int countOneN = countOne(strTen);
				if (countOneN !=0) {
					result++;
				} else {
					b = false;
					System.out.println(result);
				}
			}
			
			
		}
	}
		
		private static int countOne(String str) {
			return (int)str.chars().filter(ch -> ch == '1').count();
		}
		
		

}