import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  int n=in.nextInt();
  String s="1000000000000000001";
  BigInteger big=new BigInteger("1");
  String arr[]=new String[n];
  for(int i=0;i<n;i++)
  {
    arr[i]=in.next();
    big=big.multiply(new BigInteger(arr[i]));
  }
   String str=big.toString(10);
   if(str.length()<19)
   {
	   System.out.println(str);
   }
   else if(str.length()==19 && str.charAt(str.length()-1)=='0')
   {
	   System.out.println(str);
   }
   else
   {
	   System.out.println("-1");
   }
	}
}