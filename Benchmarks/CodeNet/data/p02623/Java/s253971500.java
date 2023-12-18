import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] aegs) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		long[] a = new long[n+1];
		long[] b = new long[m+1];

		a[0]= 0 ;
		b[0]= 0 ;

		for(int i=1;i<n+1;i++)a[i]=sc.nextLong()+a[i-1];
		for(int i=1;i<M+1;i++)a[i]=sc.nextLong()+b[i-1];

		int j = m;
		int count = 0;

		for(int i=0;i<n+1;i++)
        {
			if(a[i]>k) break;
            while (b[j] > k- a[i]) 
            {
                j -= 1;
            }
			count=Math.max(count,i+j);
		}
		System.out.println(count);

	}
}
