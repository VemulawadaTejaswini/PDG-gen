import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int count = 0;
    for(int i=a; i<=b; i++) {
      StringBuffer sb = new StringBuffer(String.valueOf(i));
      if(String.valueOf(i).equals(sb.reverse().toString()))
        count++;
    }
    System.out.println(count);
  }
}