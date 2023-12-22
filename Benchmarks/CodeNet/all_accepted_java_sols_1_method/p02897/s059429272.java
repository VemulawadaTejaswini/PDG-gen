import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    System.out.println(n%2!=0?(double)(n/2+1)/n:"0.5");
  }
}
