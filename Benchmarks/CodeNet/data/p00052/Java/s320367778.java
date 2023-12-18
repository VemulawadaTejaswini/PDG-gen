
import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		while(true){
			int n = sn.nextInt();
			if(n == 0) return;
			long fiveCnt = 0;
			long lim= 25;
			int add = 1;
			for(int i = 5; i <= n; i+=5){
				if(i == lim){
					lim*=5;
					add++;
				}
				fiveCnt += count(i, 5, add);
			}
			long twoCnt = 0;
			
			if(fiveCnt != 0){
				add = 1;
				lim = 4;
				for(int i = 2; i <= n; i+=2){
					if(i == lim){
						lim *= 2;
						add++;
					}
					twoCnt += count(i, 2, add);
				}
			}
			//System.out.println(f( new BigDecimal(n) ));
			System.out.println(Math.min(fiveCnt, twoCnt));
		}

	}
	
	 //iテ」ツ?ォnテ」ツ?古・ツ青ォテ」ツ?セテ」ツつ古」ツ?ヲテ」ツ??」ツつ凝・ツ?凝ヲツ閉ー
	static int count(int i,  int n, int lim){
		int c = 0;
		int x = (int)Math.pow(n, lim);
		
		while(lim >= 1 && i%x != 0){
			lim--;
			x/=n;
		}
		return lim;
	}
	
	static BigDecimal f(BigDecimal n){
		return n.equals(BigDecimal.ZERO)? new BigDecimal(1): n.multiply(f(n.subtract(new BigDecimal(1))));
	}
}