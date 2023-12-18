import java.util.Scanner;

public class Main {
	
	private static Scanner sc;
	
	public static void main (String args[]) {
		sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String x = sc.next();
		//n回回すのは確定
		for(int i = 1; i<=n; i++) {
			//ビット反転
			String changedSt = createChangedSt(x, i);
			//changedStの1の数
			long countOne = countOne(changedSt);
			//10進数に変換
			long xi  = Integer.parseInt(changedSt, 2); 
			//f(xi)を求める
			boolean b = true;
			int result = 0;
			while (b) {
				//xiをpopcount(xi)で割る popcount(xi) = countOne
				long der = xi%countOne;
				String strTen =  Long.toBinaryString(der);
				long countOneN = countOne(strTen);
				if (countOne==0) {
					b = false;
					System.out.println(result);
				} else {
					result++;
					xi=der;
					countOne=countOneN;
				}
			}
		}
	}

	private static String createChangedSt(String x, int i) {
		String stFirst = x.substring(0, i);
		String st = x.substring(i, i+1);
		String stLast = x.substring(i+1, x.length());
		String changedSt;
		if("0".equals(st)) {
			changedSt = stFirst + "1" + stLast;
		} else {
			changedSt = stFirst + "0" + stLast;
		}
		return changedSt;
	}
		
		private static long countOne(String str) {
			return str.chars().filter(ch -> ch == '1').count();
		}
		
		

}
