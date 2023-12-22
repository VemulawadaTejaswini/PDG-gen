import java.util.*;
import java.io.*;
public class Main{
  public static void main(String agrs[])
  {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int n = in.nextInt();
    int a = in.nextInt();
    out.println(n * a);
    out.close();
  }
}