import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    String s = str[0];
    String t = str[1];
    StringTokenizer st = new StringTokenizer(in.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    String u = in.readLine();
    if(s.equals(u))
      a--;
    else
      b--; 
    System.out.println(a + " " + b);
  }
}