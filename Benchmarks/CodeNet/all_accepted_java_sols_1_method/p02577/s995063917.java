import java.util.*;
import java.math.*;;
public class Main{
  public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	BigInteger num = sc.nextBigInteger();
    	if (num.mod(new BigInteger("9")).compareTo(new BigInteger("0")) == 0)
          System.out.println("Yes");
    	else
          System.out.println("No");
    }
}