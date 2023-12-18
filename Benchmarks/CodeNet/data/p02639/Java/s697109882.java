import java.util.*;
class Main
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
   int n = s.nextInt();
    int [] arr = new int [n];
    
    for(int i = 0; i < n;i++)
    {
      arr[i] = s.nextInt();
    }
    
    int count = 0;
    boolean found = false;
    for(int i = 0;i < n; i++)
      {
      found = false;
      for(int j = 0; j < n; j++)
      {
        if(j != i)
          if((arr[i]%arr[j]) == 0)
          {
            found = true;
            break;
          }
       
      }
      if(!found) count++;
      }
    System.out.println(count);                      
  }
}