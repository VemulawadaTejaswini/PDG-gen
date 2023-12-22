import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    long x = Long.parseLong(str[0]);
    long y = Long.parseLong(str[1]);
    
    int len = 0;
    long cur = x;
    while(cur <= y) {
      len++;
      cur = cur * 2;
     }
    
    System.out.println(len);
  }
}