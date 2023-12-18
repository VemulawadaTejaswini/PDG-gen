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
    Arrays.sort(arr);
    int count = 0;
    boolean found = false;
    for(int i = 0;i < n; i++)
      {
      found = false;
      for(int j = 0; j < i; j++)
      {
        if(j != i)
          if((arr[i]%arr[j]) == 0)
          {
            found = true;
            break;
          }
        
      }
      if(!found)count++;
    }
    System.out.println(count);                      
  }
}