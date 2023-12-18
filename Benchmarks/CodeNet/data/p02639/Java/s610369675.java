import java.util.Scanner;
 
public class Solution
{
  public static void main(String[] args)
  {
    Scanner k = new Scanner(System.in);
    int arr[] = new int[5];
    for(int i = 0; i<5; i++)
    {
      if(k.nextInt() == 0)
      {
        System.out.println(i+1);
      }
    }
  }