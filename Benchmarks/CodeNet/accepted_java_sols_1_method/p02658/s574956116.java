import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
			if(a[i]==0){
				System.out.println(0);
				return;
			}
		}
		long sum=1;
		for(int i=0; i<n; i++){
			try{
				sum=Math.multiplyExact(sum,a[i]);
				if(sum>1000000000000000000L){
					System.out.println(-1);
					return;
				}
			}catch(ArithmeticException e){
				System.out.println(-1);
				return;
			}
		}
		System.out.println(sum);
	}
}
