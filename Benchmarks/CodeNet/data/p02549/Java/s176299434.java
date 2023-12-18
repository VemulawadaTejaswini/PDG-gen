import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] l=new int[k];
		int[] r=new int[k];
		int[] b = new int[n+1];
		Arrays.fill(b,0);
		for(int i=0;i<k;i++){
			l[i]=sc.nextInt()-1;
			r[i]=sc.nextInt()-1;
		}
		for(int i=0;i<k;i++){
			for(int j=l[i];j<=r[i];j++){
				b[j]=1;
			}
		}
		
		long[] an = new long[n+1];
		an[0]=0;
		an[1]=1;
		for(int i=2;i<n+1;i++){
			long sum=0;
			for(int j=0;j<i;j++){
				sum=sum+an[Math.max(0, i-j-1)]*b[j];
			}
			an[i]=sum;
		}
		System.out.println(""+an[n]%998244353
);
	}
}