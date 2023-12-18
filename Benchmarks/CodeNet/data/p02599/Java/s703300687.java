import java.util.*;
public class Main{
  static HashMap<String,Integer> map=new HashMap<String,Integer>();
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
          String d=h+"#"+g;
          map.put(d,s1.size());
          s1.clear();
      }
    }
    while(q-->0)
    {
      int l=sc.nextInt();
      int r=sc.nextInt();
      
       Sol(a,l-1,r-1);
    }
}
  public static void Sol(int a[],int l,int r)
  {
      
      String s3=l+"#"+r;
       System.out.println(map.get(s3));
      
  }
}