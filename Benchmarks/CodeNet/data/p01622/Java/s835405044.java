import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			int r[]=new int[n];
			int w[]=new int[n];
			int sumr=0,sumw=0,rmax=0,maxindex=-1;
			for(int i=0; i<n; i++){
				r[i]=sc.nextInt();
				w[i]=sc.nextInt();
				sumr+=r[i];
				sumw+=w[i];
				if(rmax<r[i]){
					rmax=r[i];
					maxindex=i;
				}
			}
//			Arrays.sort(r);
//			System.out.println("読むのが長い奴="+rmax+" sumr="+sumr+" 待ち時間!"+(rmax-(sumr-rmax)));
//			System.out.println("sumw="+sumw);
			if(rmax <= (sumr-rmax)){
				System.out.println(sumr+sumw);
			}
			else{
				boolean dp[][]=new boolean[n+1][sumw+1];//dp[i][j]は1-iから本を選んで感想文の合計をjにできる 
				for(int i=0; i<n+1; i++){
					Arrays.fill(dp[i],false);
				}
				dp[0][0]=true;
				for(int i=0; i<n; i++){
					for(int j=0; j<=sumw; j++){
						if(dp[i][j]){
							dp[i+1][j]=true;
							if(i!=maxindex)dp[i+1][j+w[i]]=true;
						}
					} 
				}
//				for(int i=0; i<n-1; i++){
//					for(int j=0; j<sumw; j++){
//						System.out.print(" "+dp[i][j]);
//					} 
//					System.out.println();
//				}
				int max=0;
				int wait=rmax-(sumr-rmax);
				for(int i=0; i<=n; i++){
					for(int j=0; j<=sumw; j++){
						if(dp[i][j]){
							if(j <= wait && max < j){
								max=j;
							}
						}
					} 
				}
//				System.out.println(max);
				System.out.println(2*rmax+(sumw-max));
			}
		}//while
	}//run		
}