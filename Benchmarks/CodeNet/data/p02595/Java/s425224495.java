//Written by Shagoto
import java.util.*;
public class Main
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int d = read.nextInt();
    int count = 0;
    for(int x = 1; x<=n; x++)
    {
      int a = read.nextInt();
      int b = read.nextInt();
      double dist = Math.sqrt((a*a)+(b*b));
      
      if(dist <= d)
      {
        count++;
      }
    }
    
    System.out.println(count);
  }
}