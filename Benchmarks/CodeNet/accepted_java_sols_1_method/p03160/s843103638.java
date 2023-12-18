import java.util.*;
public class Main {
  
 public static void main(String args[]){
   int N=0;
   Scanner obj=new Scanner(System.in);
   N=obj.nextInt();
   int h[]=new int[N];
   for(int i=0;i<N;i++){
    h[i]=obj.nextInt();
   }
   int dp[]=new int[N];
	if(N==0)
      {
System.out.println(0);
return;
}
   if(N==1)
{     	
System.out.println(0);
return;
}
   if(N==2)
     {
System.out.println(Math.abs(h[0]-h[1]));
return;
}
   dp[0]=0;
   dp[1]=Math.abs(h[0]-h[1]);
   for(int i=2;i<N;i++){
    dp[i]= Math.min(Math.abs(h[i]-h[i-1])+dp[i-1],Math.abs(h[i] -h[i-2])+dp[i-2]);
   }
   System.out.println(dp[N-1]);
 }
}
