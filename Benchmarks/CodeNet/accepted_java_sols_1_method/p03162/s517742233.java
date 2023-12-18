import java.util.*;
import java.io.*;
   class Main{

     public static void main(String []args) throws Exception{
      // System.out.println("Hello World");
        BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
        String s;
        int N;
        s=br.readLine();
        N=Integer.parseInt(s);
        int pos=-1;
        int a=0,b=0,c=0;
        String ss[];
        long sum=0l;
        long dp[][]=new long[N][3];
        s=br.readLine();
        ss=s.split(" ");
            a=Integer.parseInt(ss[0]);
            b=Integer.parseInt(ss[1]);
            c=Integer.parseInt(ss[2]);
            int max=Math.max(a,b);
        dp[0][0]=a;
        dp[0][1]=b;
        dp[0][2]=c;
        // System.out.println("initial"+sum+"pos"+pos);
        for(int i=1;i<N;i++)
        {  
            s=br.readLine();
            ss=s.split(" ");
            a=Integer.parseInt(ss[0]);
            b=Integer.parseInt(ss[1]);
            c=Integer.parseInt(ss[2]);
           // max=Math.max(a,b);
            //max=Math.max(max,c);
            dp[i][0]=a*1l+Math.max(dp[i-1][1],dp[i-1][2])*1l;
           dp[i][1]=b*1l+Math.max(dp[i-1][0],dp[i-1][2])*1l;
           dp[i][2]=c*1l+Math.max(dp[i-1][1],dp[i-1][0])*1l;
           
        }
        System.out.println(Math.max(dp[N-1][0],Math.max(dp[N-1][1],dp[N-1][2])));
        
     }
}