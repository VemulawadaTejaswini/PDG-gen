import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		//N:学期の総数を表す
		int n = Integer.parseInt(sc.next());
		//K:学期目を表す
		int k = Integer.parseInt(sc.next());
		//各学期のテスト結果
		BigDecimal[] aArray = new BigDecimal[n];
		for (int i=0; i<n; i++) {
			aArray[i] = BigDecimal.valueOf(Integer.parseInt(sc.next()));
		}
		
		for(int i=k+1; i<=n; i++) {
			
			//K+i-1の計算
			BigDecimal beforeSum = new BigDecimal(1);
			for (int j=1; j<=k; j++) {
				beforeSum = beforeSum.multiply(aArray[i-j]);
			}
			
			//K+iの計算
			BigDecimal afterSum = new BigDecimal(1);
			for (int j=0; j<k; j++) {
				afterSum = afterSum.multiply(aArray[i-j]);
			}
			
			if(afterSum.compareTo(beforeSum) > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");				
			}
			
		}
		
	}
}
