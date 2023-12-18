import java.io.*; 
import java.util.*;

public class Main
{
  public static void main(String[] args) { new Main(); }
  Scanner in = new Scanner(System.in);
  PrintWriter out = new PrintWriter(System.out);
  
  int a, b;
  
  Main()
  {
    a = in.nextInt();
    b = in.nextInt();
    if ((a % 2) != (b % 2)) out.println("IMPOSSIBLE");
    else out.println((a+b)/2);
    out.close();
  }
}