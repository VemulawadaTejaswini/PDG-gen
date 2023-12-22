import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     long n=sc.nextLong();
      ArrayList<Long> a1=new ArrayList<Long>();
      HashMap<Long,Long>  map=new HashMap<Long,Long>();
	long a[]=new long[(int)n];
	long s=0;
       for(int i=0;i<n;i++)
      {
	    a[i]=sc.nextLong();
	    s=s+a[i];
               if(map.containsKey(a[i]))
	                 map.put(a[i],map.get(a[i])+1);
              else
  	                map.put(a[i],1l);
      }
       int q=sc.nextInt();
    Long sum=s;
      for(int i=0;i<q;i++)
      {
	long x1=sc.nextLong();
	long x2=sc.nextLong();
                 if(map.containsKey(x1))
                {
	                  sum=sum+((x2-x1)*map.get(x1));
	                  if(map.containsKey(x2))
	                         map.put(x2,map.get(x2)+map.get(x1));
                          else
	                  {
		                  map.put(x2,map.get(x1));
	                  }
                          map.remove(x1);
	           }
                   a1.add(sum);
    }     
   for(int t=0;t<a1.size();t++)
	     System.out.println(a1.get(t));
  }
}