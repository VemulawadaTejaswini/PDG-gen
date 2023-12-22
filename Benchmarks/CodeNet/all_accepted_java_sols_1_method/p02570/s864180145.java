import java.io.*;
import java.util.*;

class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int D = Integer.parseInt(st.nextToken());
    int T = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());
    float tmp = (float)D/T;
    if(S >= tmp)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}