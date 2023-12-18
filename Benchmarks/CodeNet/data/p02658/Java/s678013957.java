import java.math.BigInteger;
import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
 
 
	    //入力数字の数を入力
		Scanner sc=new Scanner(System.in);
 
	    int count=sc.nextInt();
	    
		BigInteger result=BigInteger.ZERO;
		BigInteger max=BigInteger.valueOf((long)Math.pow(10, 18));
 
	    //入力処理
		for(int i=0;i<count;i++) {
			long a=sc.nextLong();
			BigInteger nyuryoku=BigInteger.valueOf(a);
			if(i==0) {
				result=result.add(nyuryoku);
			}else {
				result=result.multiply(nyuryoku);
			}
		}
	
		
		if(result.compareTo(max)==1) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
	}
}
