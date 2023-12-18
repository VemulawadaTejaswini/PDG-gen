import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    if(a+b>=3){
      if(a%3==0 || b%3==0 || (a+b)%3==0)
        System.out.println("Possible");
      else
        System.out.println("Impossible");
    } else {
      System.out.println("Impossible");
    }
  }
}