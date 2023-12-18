import java.util.*;
public class Main{
  public static HashMap<String,Integer> map=new HashMap<String,Integer>();
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
  	int n=sc.nextInt();
    int q=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
    for(int h=0;h<n;h++)
    {
      for(int g=0;g<n;g++)
      {
          Set<Integer> s1=new HashSet<Integer>();
          for(int j=h;j<=g;j++)
           		s1.add(a[j]);
          StringBuilder d = new StringBuilder(); 
          d.append(h);
          d.append("#");
          d.append(g);
          
          map.put(d.toString(),s1.size());
          
          s1.clear();
      }
    }
    while(q-->0)
    {
      int l=sc.nextInt();
      int r=sc.nextInt();
      StringBuilder s3=new StringBuilder();
          s3.append(l-1);
          s3.append("#");
          s3.append(r-1);
       System.out.println(map.get(s3.toString()));
         
    }
}
 
}
