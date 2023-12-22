import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		int[] a=new int[n];
		long mod=1000000007;
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		long count=0;
		for(int i=0; i<n; i++){
			int aa=a[i];
			for(int j=i+1; j<n; j++){
				if(aa>a[j]){
					count++;
				}
			}
		}
		Arrays.sort(a);
		int min=a[0];
		int pp=0;
		long uu=0;
		int cc=1;
		for(int i=1; i<n; i++){
			if(min==a[i]){
				uu+=pp;
				cc++;
			}else{
				min=a[i];
				pp=cc;
				cc++;
				uu+=pp;
			}
		}
		long hhh=(((k-1)*k)/2)%mod;
		System.out.println((((k*count)%mod)+((hhh)*uu)%mod)%mod);
	}
}

