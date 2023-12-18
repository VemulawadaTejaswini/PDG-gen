import java.util.*;
public class Main
{
  
  public static void main(String args[]) 
  {
    
    Scanner sc=new Scanner(System.in);
   int len1=sc.nextInt();
   int len2=sc.nextInt();
   int k=sc.nextInt();
   ArrayList<Integer> a1=new ArrayList<Integer>();
   ArrayList<Integer> a2=new ArrayList<Integer>();
   for(int i=0;i<len1;i++)
     a1.add(sc.nextInt());
    for(int i=0;i<len2;i++)
      a2.add(sc.nextInt());
    int sum=0;
   int count=0;
    int t=0;
    while(k>=sum)
    {
        if(t==0 && a1.size()>0){
          sum=sum+a1.get(0);
          a1.remove(0);
          t=1;
          if(sum<=k)
            count++;
        }
        else if(t==1 && a2.size()>0)
        {
            sum=sum+a2.get(0);
            a2.remove(0);
            t=0;
             if(sum<=k)
            count++;
        }
        else
        {
            if(a1.size()==0)
            {
                sum=sum+a2.get(0);
                a2.remove(0);
                if(sum<=k)
                 count++;
            }
            else
            {
                 sum=sum+a1.get(0);
                a1.remove(0);
                if(sum<=k)
                 count++;
            }
        }
    }
    System.out.println(count);



  }
}