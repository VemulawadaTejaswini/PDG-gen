import java.math.BigInteger;
import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        String s = String.valueOf(n);
        int sum =0;
        for(char c:s.toCharArray())
            sum += Integer.parseInt(String.valueOf(c));
        if(sum%9==0)
         	System.out.println("Yes");
         else
         	System.out.println("No");
  	}
}

