import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int max = 0;
    for(int i = 1; i<=2; i++){
      if(a>b){
        max+=a;
        a-=1;
      } else {
        max+=b;
        b-=1;
      }
    }
    System.out.println(max);
  }
}