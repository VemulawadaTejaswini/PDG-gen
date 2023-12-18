import java.util.*;
import java.io.*;
import java.lang.*;

class Main{

    public static void main(String args[])throws IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String A,B;
	while((A = in.readLine()) != null){
	    B = in.readLine();
	    int mex = 0;
	    int[][] dp = new int[(int)(A.length())+1][(int)(B.length())+1];
	    for(int i=0;i<A.length();i++){
		for(int j=0;j<B.length();j++){
		    if(i == 0 || j == 0){
			if(A.charAt(i) == B.charAt(j)){
			    dp[i][j] = 1;
			    mex = Math.max(dp[i][j],mex);
			}
			else {
			    dp[i][j] = 0;
			}
		    }
		    else {
			if(A.charAt(i) == B.charAt(j)){
			    dp[i][j] = dp[i-1][j-1]+1;
			    mex = Math.max(dp[i][j],mex);
			}
			else {
			    dp[i][j] = 0;
			}
		    }
		}
	    }

	    System.out.println(mex);


	}

    }

}