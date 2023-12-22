import java.util.*;

class Main{
  
  public static void main(String args[])
  {

    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int n=sc.nextInt();
    int m=sc.nextInt();
    int flag=0;
    for(int i=n;i<=m;i++)
    {
      if(i%k==0){
        flag=1;
        break;
      }
    }
    
    if(flag==1)
    {
        System.out.println("OK");
    }
    else
          System.out.println("NG");
  }
}
        
    
    
    
  
  