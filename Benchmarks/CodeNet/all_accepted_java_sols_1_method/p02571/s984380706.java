import java.util.*;
public class Main
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();
   
    int min = Integer.MAX_VALUE;
    for(int i = 0 ; i < s.length() ; i++)
    {
      if(i+t.length() <= s.length())
      {
        int tot = 0;
         for(int j = 0 ; j < t.length(); j++)
         {
           if(s.charAt(i+j) != t.charAt(j))
             tot++;
         }
        min = Math.min(min , tot);
      }
    }
    System.out.println(min);
  }
  }
