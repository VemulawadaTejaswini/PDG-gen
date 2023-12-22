import java.io.*;
import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    num1 = num1 % 10;
    if((num1 == 2)||(num1 == 4)||(num1 == 5)||(num1 == 7)||(num1 == 9))
      System.out.println("hon");
    if((num1 == 3))
      System.out.println("bon");
    if((num1 == 0)||(num1 == 1)||(num1 == 6)||(num1 == 8))
      System.out.println("pon");
  };
};
    