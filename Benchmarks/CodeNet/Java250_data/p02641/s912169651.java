import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int n=sc.nextInt();
   int flag=0;
    ArrayList<Integer> a=new ArrayList<Integer>();
    ArrayList<Integer> a1=new ArrayList<Integer>();
    for(int i=0;i<n;i++)
    {
      a.add(sc.nextInt());
    }
    for(int j=0;j<=a.size();j++)
    {
         if(flag==0)
        {
         if(!a.contains(x+j))
         {
               a1.add(x+j);
               flag=1;
         }
         if(!a.contains(x-j))
        {
             a1.add(x-j);
		flag=1;
       }
       if(flag==1)
             break;
      }

        
    }
    Collections.sort(a1);
    if(n>0)
     System.out.println(a1.get(0));
    else
       System.out.println(x);
  }
}
         