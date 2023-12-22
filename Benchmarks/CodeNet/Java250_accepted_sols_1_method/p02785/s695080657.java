import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
      Scanner s = new Scanner(System.in);
      int h = s.nextInt();
      int k = s.nextInt();
      
      Integer a[] = new Integer[h];
      long sum=0;
      for(int i = 0; i <= h-1 ;i++)
        {
            a[i] = s.nextInt();
        }
      Arrays.sort(a, Collections.reverseOrder()); 
       
      for(int j = k; j<h; j++ )
      {
        sum = sum + a[j];
      }
      System.out.println("" + sum);
    }
      
   
}