import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] h=new int[n];
		for(int i=0; i<n; i++){
			h[i]=sc.nextInt();
		}
		int[] ans=new int[n];
		for(int i=0; i<m; i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			if(h[a]>h[b]){
				if(ans[a]!=-1){
					ans[a]=1;
				}
				ans[b]=-1;
			}else if(h[b]>h[a]){
				if(ans[b]!=-1){
					ans[b]=1;
				}
				ans[a]=-1;
			}else{
				ans[a]=-1;
				ans[b]=-1;
			}
		}
		int an=0;
		for(int i=0; i<n; i++){
			if(ans[i]!=-1){
				an++;
			}
		}
		System.out.println(an);
	}
}