import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n!=0){
			int ans=0,sum=0;
			for(int i=1;i<=n;i++){
				int x=in.nextInt();
				sum=Math.max(sum+x,x);
				ans=Math.max(ans,sum);
			}
			n=in.nextInt();
			System.out.println(ans);
		}
		in.close();
	}
}