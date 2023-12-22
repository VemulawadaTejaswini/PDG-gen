import java.util.Scanner;
import java.io.*;
class Main
{
public static void main(String args[])
{
  int i,j,k;
  Scanner sc = new Scanner(System.in);
  i = sc.nextInt();
  j = sc.nextInt();
  k = sc.nextInt();
  i = i+j;
  i = i+k;
  if(i>=22)
  {
    System.out.print("bust");
  }
  else
  {
    System.out.print("win");
  }
}
}