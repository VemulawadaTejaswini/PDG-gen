import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    String x_result = "x";
    for(int cnt = 1; cnt<s.length(); cnt++){
      x_result += "x";
    }
    System.out.println(x_result);
  }
}