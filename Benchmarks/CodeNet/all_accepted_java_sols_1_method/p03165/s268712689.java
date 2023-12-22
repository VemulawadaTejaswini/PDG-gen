import java.util.*;

public class Main
{
	public static void main (String[] args) 
	{
		
 		Scanner sc= new Scanner(System.in);
 		String s1= sc.next();
 		String s2 = sc.next();
 		int dp[][]=new int[s1.length()+1][s2.length()+1];
 		int maxv = Integer.MIN_VALUE;
 		for(int i=0;i<=s1.length();i++){
 		    for(int j=0;j<=s2.length();j++){
 		        if(i==0||j==0){
 		            dp[i][j]=0;
 		        }
 		        else {
 		            if(s1.charAt(i-1)==s2.charAt(j-1)){
 		                dp[i][j]= dp[i-1][j-1]+1;
 		            }
 		            else {
 		                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
 		                
 		            }
 		        }
 		    }
 		}
//  		for(int i=0;i<arr_str.length;i++){
//  		    System.out.print(arr_str[i]+" ");
//  		}
//  		System.out.println();
//  		//System.out.println(dp[s1.length()][s2.length()]);
//  		for(int i=0;i<=s1.length();i++){
//  		    for(int j=0;j<=s2.length();j++){
//  		        System.out.print(dp[i][j]+" ");
//  		    }
//  		    System.out.println("");
//  		}
        int i = s1.length();
        int j =s2.length();
        String f = "";
        int minVal = dp[s1.length()][s2.length()];
        while(i>=1 && j>=1){
            
            if (s1.charAt(i-1)==s2.charAt(j-1)){
                f = s1.charAt(i-1)+""+f;
                
                i=i-1;
                j=j-1;
                
            }
            else if (dp[i][j-1]==dp[i][j]){
               // f = s1.charAt(i)+""+f;
               j=j-1;
                
            }
            else {
                i=i-1;
            }
            }
        
 		//System.out.println(dp[s1.length()][s2.length()]);
 		System.out.println(f);
	

	    
		
	}
}