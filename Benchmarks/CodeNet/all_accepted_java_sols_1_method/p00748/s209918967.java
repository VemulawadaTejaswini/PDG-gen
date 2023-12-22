import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		
		while(true){
			int n=Integer.parseInt(in.next());
			if(n==0)break;

			List<Integer> A=new ArrayList<>(), B=new ArrayList<>();

			int j=1,s=1;
			while(s<=n){
				A.add(s);
				if(s%2==1)B.add(s);
				j++;
				s=j*(j+1)*(j+2)/6;
			}

			int DP[]=new int[n+1],INF=2000000000;
			for(int i=1;i<=n;i++)DP[i]=INF;

			for(int i=0;i<A.size();i++){
				int t=A.get(i);
				for(int k=0;k+t<=n;k++){
					DP[k+t]=Math.min(DP[k]+1, DP[k+t]);
				}
			}
			
			out.print(DP[n]+" ");
			
			for(int i=1;i<=n;i++)DP[i]=INF;
			
			for(int i=0;i<B.size();i++){
				int t=B.get(i);
				for(int k=0;k+t<=n;k++){
					DP[k+t]=Math.min(DP[k+t], DP[k]+1);
				}
			}
			
			out.println(DP[n]);
			
		}
		
		out.flush();
	}

}

