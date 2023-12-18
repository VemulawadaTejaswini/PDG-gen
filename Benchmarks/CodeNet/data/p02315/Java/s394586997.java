import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;
		int syurui=0,max_omosa=0;		// 品物のの種類と入れられる最大の重さ
		int[] weight,value;
		int[][] dp;

		try {
			str=bfr.readLine();
			if(str.equals("")) {
				System.exit(0);
			}
			else {
				stk=new StringTokenizer(str," ");
				syurui=Integer.parseInt(stk.nextToken());
				max_omosa=Integer.parseInt(stk.nextToken());
				weight=new int[syurui+1];
				value=new int[syurui+1];
				dp=new int[syurui+1][max_omosa+1];


				for(int i=0; i<syurui; i++) {
					str=bfr.readLine();
					stk=new StringTokenizer(str," ");
					value[i+1]=Integer.parseInt(stk.nextToken());
					weight[i+1]=Integer.parseInt(stk.nextToken());

				}

				for(int i=1; i<syurui+1; i++) {
					for(int j=1; j<max_omosa+1; j++) {
						if(j<weight[i]) {
							dp[i][j]=dp[i-1][j];
						}
						else {
							dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]);
						}
					}
				}
				System.out.println(dp[syurui][max_omosa]);
			}
		}catch(IOException e) {

		}
	}
}
