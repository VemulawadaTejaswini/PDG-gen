import java.util.*;
import java.io.*;
import java.math.*;

class Main{

    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
	    String s1=sc.next();
	    String s2=sc.next();
	    int[][] dp=new int[s1.length()+1][s2.length()+1];
	    int res=0;
	    for(int i=1;i<=s1.length();i++){
		for(int j=1;j<=s2.length();j++){
		    dp[i][j]=(s1.charAt(i-1)==s2.charAt(j-1) ? 1+dp[i-1][j-1] : 0);
		    res=Math.max(res,dp[i][j]);
		}
	    }
	    System.out.println(res);

	}

    }


}