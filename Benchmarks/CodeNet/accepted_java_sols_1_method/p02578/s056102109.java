import java.util.*;

public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int t=a[0];
		long sum=0;
		for(int i=1;i<n;i++){
			if(t>a[i])
				sum=sum+(t-a[i]);
			else {
				t=a[i];
				continue;
			}
		}
		System.out.println(sum);
	}
}