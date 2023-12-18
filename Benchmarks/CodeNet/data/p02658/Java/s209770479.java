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
			if(result.compareTo(max)==1) {
				break;
			}else {
				result= i==0 ? result.add(nyuryoku):result.multiply(nyuryoku);
			}
		}

		//System.out.println(result.compareTo(max));
		if(result.compareTo(max)>=0) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
	}
}
