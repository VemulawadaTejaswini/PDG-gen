import java.util.*;
import java.math.BigInteger;
public class Main 
{
	public static void main(String[] args)
    {
      BigInteger mul = new BigInteger("1");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        while(num >= 0)
        {
          int b = sc.nextInt();
          mul.multiply(new BigInteger(sc.nextInt()));
          num--;
        }
      BigInteger bd = new BigInteger("1000000000000000000");
      if(mul.equals(bd) || mul.compareTo(bd)>0)
		System.out.println(mul);
      else
        System.out.println(-1);
	}
}