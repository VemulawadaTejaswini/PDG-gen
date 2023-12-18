import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		int[] b=new int[m];
		for(int i=0; i<m; i++){
			b[i]=sc.nextInt();
		}
		int ans=0;
		int ain=0;
		int bin=0;
		while(k>0){
			int sub=0;
			if(ain==a.length){
				sub=b[bin++];
			}else if(bin==b.length){
				sub=a[ain++];
			}else if(a[ain]>b[bin]){
				sub=b[bin++];
			}else{
				sub=a[ain++];
			}
			
			if(k>=sub){
				k-=sub;
				ans++;
			}else{
				break;
			}
			if(ain==a.length && bin==b.length){
				break;
			}
		}
		System.out.println(ans);
	}
}
