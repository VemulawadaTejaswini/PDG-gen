import java.math.BigInteger;
import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
 
 
	    //入力数字の数を入力
		Scanner sc=new Scanner(System.in);
 
	    int count=sc.nextInt();
	    long[] nyuryoku = new long[count];
	    

		BigInteger result=BigInteger.ZERO;
		
		long max=(long)Math.pow(10, 18);
 
	    //入力処理
		for(int i=0;i<count;i++) {
			nyuryoku[i]=sc.nextLong();
			BigInteger.valueOf(nyuryoku[i]);
			if(result==BigInteger.ZERO) {
				result=result.add(BigInteger.valueOf(nyuryoku[i]));
			}else {
				result=result.multiply(BigInteger.valueOf(nyuryoku[i]));
			}
		}
		
		BigInteger bigMax=BigInteger.valueOf(max);
		
		if(result.compareTo(bigMax)==1) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
	}
}
