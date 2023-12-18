import java.util.*;
 
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long k=sc.nextLong();
		int a[]=new int[(int)n];
		long sum =0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		if(n < k)
			System.out.println("0");
		else{
			for(int i=0;i<n-k;i++)
				sum+=a[i];
			System.out.println(sum);
		}
	}
}