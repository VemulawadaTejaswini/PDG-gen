import java.util.*;

public class Main
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    int red = 0;
    int white = 0;
    for(int i = 0 ; i < s.length() ; i++)
    {
      if(s.charAt(i) == 'R')
        red++;
    }
    int ans = Integer.MAX_VALUE;
    for(int i = 0 ; i <s.length() ; i++)
    {
      ans = Math.min(ans , Math.max(white , red));
      if(s.charAt(i) == 'W')
        white++;
      
      else
        red--;
    }
     ans = Math.min(ans , Math.max(white , red));
    System.out.println(ans);
    }
  }
