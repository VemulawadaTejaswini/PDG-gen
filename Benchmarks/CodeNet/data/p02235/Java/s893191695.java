import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rslt[] = new int[n]; 
        for(int i=0;i<n;i++){
        	String A = sc.next();
			String B = sc.next();
			int[][] DP = new int[A.length() + 1][B.length() + 1];
			for(int j=0;j<A.length()+1;j++){//DP初期化
			    DP[j][0] = 0;
			}
	    	for(int j=0;j<B.length()+1;j++){
			    DP[0][j] = 0;
			}
			for(int j = 1; j <= A.length(); j++) {
				for(int k = 1; k <= B.length(); k++) {
					if(A.charAt(j - 1) == B.charAt(k - 1)) {
						DP[j][k] = DP[j - 1][k - 1] + 1;
					}else {
						DP[j][k] = Math.max(DP[j - 1][k], DP[j][k - 1]);
					}
				}
			}
			System.out.println(DP[A.length()][B.length()]);
        }
    }
}

