import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(in.readLine());
    int S = Integer.parseInt(st.nextToken());
    int W = Integer.parseInt(st.nextToken());
    System.out.println(S>W?"safe":"unsafe");
  }
}