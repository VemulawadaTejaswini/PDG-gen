import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    int h1 = Integer.parseInt(s[0]);
    int w1 = Integer.parseInt(s[1]);
    s = br.readLine().split(" ");
    int h2 = Integer.parseInt(s[0]);
    int w2 = Integer.parseInt(s[1]);
    
    System.out.println((h1 - h2) * (w1 - w2));
  }
}