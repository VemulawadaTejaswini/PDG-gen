import java.math.BigInteger; 
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger[] A = new BigInteger[N];
		BigInteger comp = new BigInteger("1000000000000000000");
		for(int i=0;i<N;i++)
		{
		    A[i]=sc.nextBigInteger();
		}
		Arrays.sort(A); 
		BigInteger ans = A[0];
		for(int i=1;i<N;i++)
		{
		    ans = ans.multiply(A[i]);
		    if(ans.compareTo(comp)>0 || ans.equals(0))
		    {
		        break;
		    }
		}
		if(ans.compareTo(comp)>0)
		{
		   System.out.println(-1);
		}
		else{
		    System.out.println(ans);
		}
	}
}
