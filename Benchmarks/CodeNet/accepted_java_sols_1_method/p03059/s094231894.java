import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int t = Integer.parseInt(str[2]);
    int sum = 0;
    for(int i = 1; a*i <= t; i++){
      sum += b;
  }
    System.out.println(sum);
  }
}