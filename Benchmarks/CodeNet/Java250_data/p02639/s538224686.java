import java.util.*;
class Main
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
    int count = 0;
    int n = 9;
    while(n != 0)
    {
      n = s.nextInt();
      count++;
    } 
    System.out.println(count);
  }
}