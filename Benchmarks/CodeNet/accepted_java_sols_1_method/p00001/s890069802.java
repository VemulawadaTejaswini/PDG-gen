import java.util.*;
import java.util.Arrays;
public class Main
{
  public static void main (String[]args)
  {
    Scanner k=new Scanner (System.in);
    int[]x=new int[10];
    for(int i=0;i<x.length;i++)    {
      x[i]=k.nextInt();
    }
    Arrays.sort(x);
    for(int i=x.length-1;i>6;i--)
    {
      System.out.println(x[i]);
    }
  }
}
    