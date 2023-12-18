import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			String t=sc.next();
			int sl = s.length(),tl=t.length();
			short[][] dp = new short[sl+1][tl+1];
			int max=0;
			for(int i=1;i<sl+1;i++){
				for(int j=1;j<tl+1;j++){
					if(s.charAt(i-1)==t.charAt(j-1)){
						dp[i][j] = (short) (dp[i-1][j-1]+1);
						max = Math.max(max, dp[i][j]);
					}else{
						dp[i][j]=0;
					}
				}
			}
			System.out.println(max);
		}
	}
}