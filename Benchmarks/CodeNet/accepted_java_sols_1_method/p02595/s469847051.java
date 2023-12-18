import java.util.*;

public class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long d=sc.nextLong();
		
		long[] x=new long[n];
		long[] y=new long[n];
		int count=0;
		for(int i=0;i<n;i++){
			x[i]=sc.nextLong();
			y[i]=sc.nextLong();
		}
		
		for(int i=0;i<n;i++){
			long num=x[i]*x[i]+y[i]*y[i];
			if(num<=d*d)count++;
		}
		System.out.println(count);
		sc.close();
		return;
	}
}