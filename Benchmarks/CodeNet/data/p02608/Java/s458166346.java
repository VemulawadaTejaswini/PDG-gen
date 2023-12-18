import java.util.*;








public class Main
{
  
  public static int fact(int n)
{
  int res=0,temp=0;
   for(int i=1;i<=n;i++)
    {
     
      
      for(int j=1;j<=n;j++)
      {
        for(int k=1;k<=n;k++)
        {
          temp=0;
          temp=((i*i)+(j*j)+(k*k)+(i*j)+(j*k)+(k*i));
          if(temp==n)
          {
            res++;
           
          }
         
        }
      }
    
    }
  
  return res;
  
  
}



  
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n1,a,res=0,temp,ret=0;
    
   
    n1=s.nextInt();
    
    for(int i=1;i<=n1;i++)
    {
     ret=fact(i);
      System.out.println(ret);
    
    }
    
  }
}
      
      