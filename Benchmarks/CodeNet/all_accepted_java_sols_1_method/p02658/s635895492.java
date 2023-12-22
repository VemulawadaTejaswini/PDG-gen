// Java program to find large factorials using BigInteger 
import java.math.BigInteger; 
import java.util.Scanner; 

public class Main
{

	// Driver method 
	public static void main(String args[]) throws Exception 
	{ 
    	Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
        BigInteger [] a = new BigInteger[N];
        String MX = "1000000000000000000";
        for(int i=0;i<N;i++)
        {
            String str = sc.next();
            a[i]=new BigInteger(str); 
            if(a[i].compareTo(new BigInteger("0"))==0)
            {
                System.out.println("0");
                return ;
            }
        }
        BigInteger f= a[0];
        for(int i=1;i<N;i++)
        {
            f=f.multiply(a[i]);
            if(f.compareTo(new BigInteger(MX))==1)
            {
                System.out.println("-1");
                return ;
            }
        }
		System.out.println(f); 
	} 
} 
