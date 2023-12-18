import java.util.*;
import java.lang.*;
import java.math.BigInteger;
public class Main{
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
   
   BigInteger b=sc.nextBigInteger();
   BigInteger x=b.mod(new BigInteger("9"));
   if(x.equals(new BigInteger("0")))System.out.println("Yes");
   else System.out.println("No");
    
  }
}