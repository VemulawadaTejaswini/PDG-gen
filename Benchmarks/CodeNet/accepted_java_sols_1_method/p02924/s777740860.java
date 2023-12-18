import java.io.*;
import java.util.*;
 
class Main
{
  public static void main(String Args[])
  {
    Scanner in = new Scanner(System.in);
    long n = in.nextLong();
    System.out.println(n*(n-1)/2);
  }
}