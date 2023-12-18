import java.util.*;

public class  Main 
{
   static  int n , arr[];
   static  long k;
    static boolean check(int x)
    {
        long tot= 0;
        
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i]%x == 0)
            tot += arr[i]/x - 1;
            
            else
            tot += arr[i]/x;
        }
        
        if(tot <= k)
        return true;
        
        return false;
    }
    
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
          k = sc.nextLong();
        arr = new int[n];
        for(int i = 0 ;i  < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int l = 1 , r = 1000000000;
        while(l < r)
        {
            int mid = (l+r)/2;
            if(check(mid))
            r = mid;
            
            else 
            l = mid+1;
        }
        System.out.println(l);
    }
}