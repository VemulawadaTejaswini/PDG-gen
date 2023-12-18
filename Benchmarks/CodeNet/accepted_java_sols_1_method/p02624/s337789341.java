
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] num = new long[10000002];
		
		for (int i = 0; i<num.length;i++)
		{num[i]=0;}
	
		for (int i = 1; i<num.length;i++)
		{
			int i2 = i;
			while(i2 < 10000001)
			{
				num[i2]++;
				i2 += i;	
			}
		}
		
		long ans = 0;
		
		for (int i = 1; i < (N+1) ;i++)
		{
          long temp = i*num[i];
			ans += temp;
			}
		System.out.println(ans);
   
        }
		
	}