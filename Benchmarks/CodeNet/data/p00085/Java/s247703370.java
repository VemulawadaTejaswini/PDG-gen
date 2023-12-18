import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m,i,c,k=1;
		boolean f[];
		while(true){
			n=sc.nextInt();
			m=sc.nextInt();
			if(n==0 && m==0) break;
			f=new boolean[n+1];
			Arrays.fill(f,true);
			c=0;k=0;
			for(i=0;;){
				if(c==n-1) break;

				//System.out.println(i+" "+k+" "+(c+1));

				if(k==m*(c+1) && f[i]){
					f[i]=false;
					//System.out.println(i);
					c++;
					k++;
				}
				else if(f[i]){
					k++;
				}
				i++;
				if(i>=n+1) i=1;
			}
			for(i=1;i<=n;i++){
				if(f[i])
					System.out.println(i);
			}
		}
	}
}