import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(), zero = 0;
		BigInteger nums[] = new BigInteger[size];
		for(int i = 0; i < size; i++){
			String str = sc.next();
			if(str.equals("0")){zero++;}
			nums[i] = new BigInteger(str);
		}
		if(zero > 0){System.out.println("0"); return;}
		BigInteger base = new BigInteger("1000000000000000000"), ans = BigInteger.ONE;
		for(BigInteger num : nums){
			if(num.compareTo(base) > 0){
				System.out.println("-1"); return;
			} else {
				ans = ans.multiply(num);
				base = base.divide(num);
			}
		}
		System.out.println(ans);
	}
}