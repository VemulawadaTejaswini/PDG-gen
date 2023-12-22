import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String s = input.next();
    
    int i=0,j=s.length()-1;
    int g = 0;
    while(i<j)
    {
      if(s.charAt(i)!=s.charAt(j))
        	g++;
      i++;
      j--;
    }
    
    System.out.println(g);
   }
}
