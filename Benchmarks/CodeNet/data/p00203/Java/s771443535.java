import java.util.Scanner;

public class Main2 {

	static int H,W;
	static int[][] field;
	static int[][] dp;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			W=cin.nextInt();
			H=cin.nextInt();
			if(W+H==0)break;
			field=new int[H+2][W];
			dp=new int[H+2][W];
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					field[i][j]=cin.nextInt();
				}
			}
			for(int i=0;i<W;i++){
				if(field[0][i]==0)dp[0][i]=1;
			}
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					if(field[i][j]==0){
						if(i!=H-1){
							for(int k=-1;k<=1;k++){
								if(j+k<0||j+k>=W)continue;
								if(field[i+1][j+k]==1)continue;
								if(k!=0&&field[i+1][j+k]==2)continue;
								dp[i+1][j+k]+=dp[i][j];
							}							
						}
						else{
							dp[i+1][j]+=dp[i][j];
						}
					}
					else if(field[i][j]==2){
						dp[i+2][j]+=dp[i][j];
					}
				}
			}
			int ans=0;
			for(int i=H;i<H+2;i++){
				for(int j=0;j<W;j++){
					ans+=dp[i][j];
				}
			}
			System.out.println(ans);
			
		}
	}

}