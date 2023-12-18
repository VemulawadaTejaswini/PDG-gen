import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i,n,x[]=new int[10004];
		BigInteger tmp,ans,y[]=new BigInteger[10004];

		while(true){
			n = scan.nextInt();
			if(n == 0) break;

			for(i=0;i<n;i++) x[i] = scan.nextInt();
			Arrays.sort(x,0,n);
			tmp = new BigInteger("0");
			ans = new BigInteger("0");
			for(i=0;i<n;i++){
				y[i] = new BigInteger(Integer.toString(x[i]));
			}
			for(i=0;i<n-1;i++){
				tmp = tmp.add(y[i]);
				ans = ans.add(tmp);
			}
			System.out.println(ans);
		}
	}
}