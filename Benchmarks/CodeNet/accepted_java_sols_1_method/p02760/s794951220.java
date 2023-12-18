import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[][] a=new int[3][3];
    for(int i=0;i<3;i++)
      for(int j =0;j<3;j++)
      {
        a[i][j]=sc.nextInt();
      }
    int q=sc.nextInt();
    int x=0;
    for(int r=0;r<q;r++)
    {
      int n=sc.nextInt();
      for(int i=0;i<3;i++)
      for(int j =0;j<3;j++)
      {
       if( a[i][j]==n)
         a[i][j]=1;
      }
      if(a[0][0]==1 && a[1][1]==1 && a[2][2]==1)
      {x=1;
       break;
      }
      if(a[0][0]==1 && a[0][1]==1 && a[0][2]==1)
      {x=1;
       break;
      }
      if(a[0][1]==1 && a[1][1]==1 && a[2][1]==1)
      {x=1;
       break;
      }
       
      
      if(a[0][2]==1 && a[1][2]==1 && a[2][2]==1)
      {x=1;
       break;
      }
      
      if(a[1][0]==1 && a[1][1]==1 && a[1][2]==1)
      {x=1;
       break;
      }
      
      if(a[2][0]==1 && a[2][1]==1 && a[2][2]==1)
      {x=1;
       break;
      }
      
      if(a[0][0]==1 && a[1][0]==1 && a[2][0]==1)
      {x=1;
       break;
      }
      
      if(a[0][2]==1 && a[1][1]==1 && a[2][0]==1)
      {x=1;
       break;
      }
    

            

    }
    if(x==1)
      System.out.println("Yes");
    else
      System.out.println("No");
        
  }
  

}
