import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int dp[]=new int[40050];
        for(int i=0;i<40050;i++)dp[i]=0;
        dp[0]=1;
        for(int i=0;i<n;i++){
            for(int j=40010;j>=0;j--){
                if(dp[j]>0)dp[j+a[i]]=1;
            }
        }
        int q;
        q=sc.nextInt();
        int c;
        while(q>0){
            q--;
            c=sc.nextInt();
            if(dp[c]==1) System.out.println("yes");
            else  System.out.println("no");
        }
       }
}
