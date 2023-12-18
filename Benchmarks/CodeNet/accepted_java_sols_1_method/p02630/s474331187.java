import java.util.*;

public class Main {
    public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
        
       long n=sc.nextLong();
     
       HashMap<Long,Long> map=new HashMap<>();
       long sum=0;
       for(long i=0;i<n;i++)
       {
           long k=sc.nextLong();
           sum+=k;
           if(map.containsKey(k))
           {
              long b=map.get(k);
               map.put(k,b+1);
           }
           else
           map.put(k,1L);
       }
       
       long q=sc.nextLong();
       
        for(long i=0;i<q;i++)
        {
            
            long b=sc.nextLong();
         long  c=sc.nextLong();
            
            if(map.containsKey(b))
            {
                
                long k=map.get(b);
                
                sum=sum- (long)k*b+ (long)k*c;
                map.remove(b);
                
                    if(map.containsKey(c))
                    {
                      long v=map.get(c);
                        map.put(c,v+k);
                    }
                    else
                    map.put(c,k);
          
            }
            System.out.println(sum);
            
        }

    }
}