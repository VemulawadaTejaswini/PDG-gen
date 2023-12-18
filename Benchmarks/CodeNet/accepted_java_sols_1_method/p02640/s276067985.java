import java.util.*;
class Main
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int l = s.nextInt();
    
    if((l - 2 * a)%2 == 0)
    {
      int t = (l - 2 * a)/2;
      int c = a - t;
      
      if(t >= 0 && c >= 0)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
       else
        System.out.println("No");
                          
  }
}