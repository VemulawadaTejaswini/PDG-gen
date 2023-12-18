import java.util.Scanner;

public class Main {

	static int[][] field;
	static String[][] dp;
	static int h,w;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			w = cin.nextInt();
			h = cin.nextInt();
			if(w+h==0)break;
			field=new int[h][w];
			dp=new String[h][w];
			for(int i = 0;i<h;i++){
				String s = cin.next();
				for(int j = 0;j<w;j++){
					dp[i][j]="";
					if(Character.isDigit(s.charAt(j))){
						field[i][j]=s.charAt(j)-'0';
					}
					else{
						field[i][j]=-1;
					}
				}
			}
			for(int i = 0;i<w;i++){
				if(field[0][i]<=0){
					
				}
				else{
					dp[0][i]=""+field[0][i];
				}
			}
			for(int i = 0;i<h;i++){
				if(field[i][0]<=0){
					
				}
				else{
					dp[i][0]=""+field[i][0];
				}
			}
			String ans="0";
			for(int i = 1;i<h;i++){
				for(int j = 1;j<w;j++){
					if(field[i][j]==-1)continue;
					String s1=dp[i-1][j]+field[i][j];
					String s2=dp[i][j-1]+field[i][j];
					String s3=field[i][j]+"";
					if(big(s1,s2)>=0){
						if(big(s1,s3)>=0){
							dp[i][j]=s1;							
						}
						else{
							dp[i][j]=s3;
						}
					}
					else{
						if(big(s2,s3)>=0){
							dp[i][j]=s2;							
						}
						else{
							dp[i][j]=s3;
						}
					}
					while(dp[i][j].charAt(0)=='0'){
						dp[i][j]=dp[i][j].substring(1,dp[i][j].length());
					}
					if(big(dp[i][j],ans)>0){
						ans=dp[i][j];
					}
				}
			}
			//output();
			System.out.println(ans);
		}
		
	}
	static int big(String s1,String s2){
		if(s1.length()==s2.length()){
			return s1.compareTo(s2);
		}
		return s1.length()-s2.length();
	}
	static void output(){
		for(int i = 0;i<h;i++){
			for(int j = 0;j<w;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}		
		System.out.println();
	}
}