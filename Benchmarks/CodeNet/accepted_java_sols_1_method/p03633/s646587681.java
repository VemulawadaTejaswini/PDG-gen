import java.math.BigInteger;
import java.util.*;  

/*求最大公约数和最小公倍数*/  
public class Main {  
  
    public static void main(String[] args) {  
        Scanner cin = new Scanner(System.in);// 接收控制台输入的信息  
        int n;
        n = cin.nextInt();
        
        BigInteger ans = BigInteger.valueOf(1);
        for(int i=1 ;i<=n ;i++) {
        	BigInteger x;
        	x = cin.nextBigInteger();
        	BigInteger tem = ans.gcd(x);
        	ans = ans.multiply(x);
        	ans = ans.divide(tem);
        }
        System.out.println(ans);
    }  
}  