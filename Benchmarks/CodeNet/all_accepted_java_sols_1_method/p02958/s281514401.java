import java.io.*;
import java.util.*;

public class Main
{
  public static void main(String[] args) { new Main(); }
  Scanner in = new Scanner(System.in);
  PrintWriter out = new PrintWriter(System.out);
  
  int n, cnt = 0;
  
  Main()
  {
   	n = in.nextInt();
    for (int i = 1; i <= n; i++)
      	if (in.nextInt() != i) cnt++;
    if (cnt == 0 || cnt == 2) out.println("YES");
    else out.println("NO");
    out.close();
  }
}
