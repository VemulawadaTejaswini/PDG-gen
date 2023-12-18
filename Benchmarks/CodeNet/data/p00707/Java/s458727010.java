import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static String[][] dp;
	static char[][] code;
	static int W;
	static int H;
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		
		while (true) {
			W = sc.nextInt();
			H = sc.nextInt();
			if(W==0&&H==0) break;
			dp = new String[H][W];
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					dp[i][j] = "-1";
				}
			}
			code = new char[H][W];
			for (int i = 0; i < H; i++) {
				String tmp = sc.next();
				for (int j = 0; j < W; j++) {
					code[i][j] = tmp.charAt(j);
				}
			}
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					dinamic(i, j);
				}
			}
			String maxtmp = "0";
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if(dp[i][j].charAt(0)!='0'){
						maxtmp = max(maxtmp,dp[i][j]);
					}
				}
			}
			pr.println(maxtmp);
		}
		pr.flush();
		sc.close();
	}

	private static String dinamic(int i, int j) {
		if(dp[i][j].equals("-1")==false) return dp[i][j];
		if(code[i][j]<'0'||code[i][j]>'9'){
			return dp[i][j];
		}else{
			String tmp1;
			String tmp2;
			if(i+1==H){
				tmp1 = "-1";
			}else{
				tmp1= dinamic(i+1,j);
			}
			if(j+1==W){
				tmp2 = "-1";
			}else{
				tmp2= dinamic(i,j+1);
			}
			if(tmp1.equals("-1")==false){
				tmp1 = code[i][j]+tmp1;
			}
			if(tmp2.equals("-1")==false){
				tmp2 = code[i][j]+tmp2;
			}
			if(tmp1.equals("-1")&&tmp2.equals("-1")){
				dp[i][j] = String.valueOf(code[i][j]);
				return String.valueOf(code[i][j]);
			}
			dp[i][j] = max(tmp1, tmp2);
			return dp[i][j];
		}
	}

	private static String max(String tmp1, String tmp2) {
		if(tmp1.equals("-1")){
			return tmp2;
		}
		if(tmp2.equals("-1")){
			return tmp1;
		}
		if(tmp1.length()>tmp2.length()){
			return tmp1;
		}else if(tmp1.length()<tmp2.length()){
			return tmp2;
		}else{
			for(int k=0;k<tmp1.length();k++){
				if(tmp1.charAt(k)-'0'>tmp2.charAt(k)-'0'){
					return tmp1;
				}else if(tmp1.charAt(k)-'0'<tmp2.charAt(k)-'0'){
					return tmp2;
				}
			}
		}
		return tmp1;
	}
}