import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S1=0; int S2=0; int S3=0;
		int N = sc.nextInt();
		//整数型配列の宣言と初期化
		int [] arys;
		arys = new int [N];
		
		for(int i=0; i<N;i++)
		{		
		arys[i]=sc.nextInt();
		}
		
		int [] anss;
		anss = new int [N-1];

		for(int j=0;j<=N-2;j++){
			S1=0;S2=0;S3=0;
			for(int k=0;k<=j;k++){			
			S1=S1+arys[k];		
			}
			for(int k=j+1;k<=N-1;k++){			
			S2=S2+arys[k];	
			}	
			S3=Math.abs(S1-S2);
			anss[j]=S3;	
		}		
		// 最小値を求める		
		int ans=anss[0];	
        for(int i = 0; i <=N-2 ; i++){
            ans = Math.min(ans,anss[i]);
        }
		System.out.println(ans);
		}
}
