import java.util.*;
public class Main
{
  public static void main(String[] args )
  {
    Scanner scn = new Scanner(System.in) ;
    
    int n = scn.nextInt() ;
    
    int k = scn.nextInt() ;
    
    int[] arr =new int[n] ;
    
    for(int i =0 ; i < n; i++ ) arr[i] = scn.nextInt() ;
    
    
    if( n== 1 )
    {
     System.out.print(0) ; 
    }
    else{
    long[] dp = new long[n];
    
      dp[0] =  0 ; 
      //dp[1] =  (long)Math.abs(arr[1] - arr[0] ) ;
      
      for(int i =1 ; i < n; i++ )
      {
        long ans =  Long.MAX_VALUE ;
          
        
        for(int j = 1  ; j <= k ; j++ )
        {
         if( i-j < 0 ) break ;
          
          else{
           
            ans = Math.min(dp[i-j] + Math.abs(arr[i] - arr[i-j] ) ,ans ) ;
            
            
            }
          
        }
        dp[i] = ans  ;
        
        
     }
      
      System.out.print(dp[n-1]) ;
    
    }
    
    
    
  }
  
  
}
