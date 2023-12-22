import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    for(int i=1;i<=3;i++)
    {
      int a = input.nextInt();
      sum+=a;
    }
    if(sum>=22)
      System.out.println("bust");
    else
      System.out.println("win");
  }
}
