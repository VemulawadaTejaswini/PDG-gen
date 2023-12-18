import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
class Main {
	class AOJ0504{
		void run(){
			Scanner sc=new Scanner(System.in);
			BigDecimal answer = new BigDecimal(1);
			BigDecimal one = new BigDecimal(1);
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			int r = sc.nextInt();
			if(n == 0) return ;
			if(m==1){
				for(int i = 1 ; i <= n-1 ; i++){
					//System.out.printf("%d\n",i);
					answer = answer.add(one.divide(new BigDecimal(i),10000,BigDecimal.ROUND_HALF_UP));
				}
			}
			answer = answer.divide(new BigDecimal(n),10000,BigDecimal.ROUND_HALF_UP);
			String s = answer.toPlainString();
			for(int i = 0 ; i < r+2 ; i++)
				System.out.printf("%c",s.charAt(i));
			System.out.printf("\n");
		}
	}
	public static void main(String[] args) {
		new Main().new AOJ0504().run();
	}
}