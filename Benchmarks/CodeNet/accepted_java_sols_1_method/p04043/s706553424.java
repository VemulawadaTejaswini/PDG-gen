import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(in.readLine());
    
    int fiveCount = 0;
    int sevenCount = 0;
    for (int i = 0; i < 3; i++) {
        int x = Integer.parseInt(st.nextToken());
        if (x == 5)
             fiveCount++;
        if (x == 7) 
             sevenCount++;
    }
    if (fiveCount == 2 && sevenCount == 1)
         System.out.println("YES");
    else 
         System.out.println("NO");
  }
}