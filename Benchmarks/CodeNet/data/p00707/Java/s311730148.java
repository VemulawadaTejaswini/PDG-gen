import java.util.*;
public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if((w|h) == 0)break;
			char [][] data =new char[h][w];
			for(int i = 0 ; i < h; i++){
				String s = sc.next();
				for(int j = 0 ; j < w; j++){
					data[i][j] = s.charAt(j);
				}
			}
			
			String [][] dp = new String[h][w];
			for(int i = 0 ; i < h; i++){
				for(int j = 0 ; j < w; j++){
					if(Character.isDigit(data[i][j]) && (data[i][j] != '0')){
						dp[i][j] = data[i][j] + "";
					}
					else{
						dp[i][j] = "";
					}
				}
			}
			
			for(int i = 0; i < h; i++){
				for(int j = 0 ; j < w; j++){
					if(! Character.isDigit(data[i][j])) continue;
					if(data[i][j] == '0' && dp[i][j].equals("")) continue;
					if(i + 1 != h){
						if(dp[i+1][j].length() < dp[i][j].length()  + 1){
							dp[i+1][j] = dp[i][j] + data[i+1][j];
						}
						else if(dp[i+1][j].length() == dp[i][j].length()  + 1 && dp[i+1][j].compareTo(dp[i][j] + data[i+1][j]) < 0){
							dp[i+1][j] = dp[i][j] + data[i+1][j];
						}
					}
					if(j + 1 != w){
						if(dp[i][j+1].length() < dp[i][j].length()  + 1){
							dp[i][j+1] = dp[i][j] + data[i][j+1];
						}
						else if(dp[i][j+1].length() == dp[i][j].length()  + 1  && dp[i][j+1].compareTo(dp[i][j] + data[i][j+1]) < 0){
							dp[i][j+1] = dp[i][j] + data[i][j+1];
						}
					}
				}
			}
			
			//debug
//			for(int i = 0 ; i < h; i++){
//				for(int j  = 0 ;  j < w; j++){
//					if(dp[i][j].equals("")){
//						System.out.print(". ");
//					}
//					else{
//						System.out.print(dp[i][j] + " ");
//						
//					}
//				}
//				System.out.println();
//			}
			
			String ans = "";
			for(int i = 0 ; i < h; i++){
				for(int j = 0 ; j < w; j++){
					if(! Character.isDigit(data[i][j])) continue;
					if(ans.length() < dp[i][j].length()){
						ans = dp[i][j];
					}
					else if(ans.length() == dp[i][j].length()&& ans.compareTo(dp[i][j]) < 0){
						ans = dp[i][j] ;
					}
				}
			}
			System.out.println(ans);
		}
	}
	
	public static void main(String [] args){
		new Main().doit();
	}
}