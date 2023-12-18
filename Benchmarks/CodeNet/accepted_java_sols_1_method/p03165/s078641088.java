import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int l1=s1.length();
        int l2=s2.length();
        int dp[][]=new int[l1+1][l2+1];
        
        
        //System.out.println(s1+" "+s2);
        for(int i=0;i<=l1;i++)
        {
            for(int j=0;j<=l2;j++)
            {
                if(i==0|| j==0)
                {
                    dp[i][j]=0;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1] );
                }
            }
        }
        //System.out.println(dp[l1][l2]);
       
        int i=l1;
        int j=l2;
        int ind=dp[l1][l2];
       // System.out.println(ind);
        int t=ind;
        char l[]=new char[ind+1];
        
        l[ind]=' ';
        while(i>0 && j>0)
        {
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                l[ind-1]=s1.charAt(i-1);
                i--;j--;ind--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
            {
                i--;
            }
            else
                j--;
        }
       for(int k=0;k<t;k++) 
            System.out.print(l[k]); 
    }
}
