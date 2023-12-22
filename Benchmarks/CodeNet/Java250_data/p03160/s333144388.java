import java.io.*;
import java.util.*;

public class Main{ 
   static class Fast{
     public BufferedReader br;
     public StringTokenizer st;
     
     public Fast(){
          br =new BufferedReader(new InputStreamReader(System.in));
     }
     
     String next(){
          while(st==null || !st.hasMoreTokens()){
               try{
                    st=new StringTokenizer(br.readLine());
               }
               catch(IOException e){
                    throw new RuntimeException(e);
               }
               
          }
               return st.nextToken();
          }
     int nextInt(){
          return Integer.parseInt(next());
     }

     long nextLong(){
          return Long.parseLong(next());
     }

 }
  
	public static void main(String[] args)throws Exception{
         //StringTokenizer st;//! @ % & * () _ {} # ~ : < > ? "" | ^
          Fast f=new Fast();
         PrintWriter out = new PrintWriter(System.out);
        // StringBuilder str=new StringBuilder();
         //  int x=Integer.parseInt(st.nextToken());
         
        //st=new StringTokenizer(br.readLine()); 

        
        int n=f.nextInt();
        int h[]=new int[n+1];
        for (int i=0;i<n;i++ ) {
          h[i+1]=f.nextInt();
        }

        int dp[]=new int[n+1];
        dp[0]=0;dp[1]=0;dp[2]=Math.abs(h[2]-h[1]);
        int way1=0,way2=0;
        for (int i=3;i<dp.length;i++) {
            way1=dp[i-1]+Math.abs(h[i]-h[i-1]);
            way2=dp[i-2]+Math.abs(h[i]-h[i-2]);
           dp[i]=Math.min(way1,way2);
        }

        out.println(dp[n]);
    out.close();

}
}


