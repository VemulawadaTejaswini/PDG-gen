import java.util.*;

 class Main
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    for(int i = 1; i <= n; i ++)
    {
      if(i % 3 == 0)
      {
        System.out.printf(" %d",i);
      }
      else 
      {
        int x = i;
        
        do
        {
          if(x % 10 == 3)
          {
            System.out.printf(" %d",i);
            
            break;
          }
          x /= 10;
        }while (x != 0);
      }
    }
    System.out.println();
   }
 }
    
