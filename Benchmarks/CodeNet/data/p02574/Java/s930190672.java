import java.util.*;
public class Main
{
 static int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
}
  
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    int n = 1000000;
    int prime[] = new int[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = i; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == p) 
            { 
                // Update all multiples of p 
                for(int i = p*p; i <= n; i += p) 
                    prime[i] = p;
            } 
        }
    
    int k = sc.nextInt();
    int arr[] = new int[k];
    arr[0] = sc.nextInt();
    int gg = arr[0];
    for(int i = 1 ; i < k ; i++)
    {
      arr[i] =  sc.nextInt();
      gg = gcd(gg,arr[i]);
    }
    if(gg > 1)
      System.out.println("not coprime");
    
    else
    {
      boolean pr[] = new boolean[1000001];
      boolean bl = true;
      for(int i = 0 ; i < k ; i++)
      {
        while(arr[i] > 1)
        {
          int x = prime[arr[i]];
          if(pr[x] == true)
          {
            bl = false;
            break;
          }
          
          else
          {
            pr[x] = true;
            while(arr[i]%x == 0)
            {
              arr[i] = arr[i]/x;
            }
              
          }
        }
      }
      if(bl)
        System.out.println("pairwise coprime");
      
      else
        System.out.println("setwise coprime");
    }
    
  }
}