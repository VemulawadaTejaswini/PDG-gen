import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(in.readLine());
    int max = 0;
    for(int i=2; i<=x; i++) {
      for(int j=2; Math.pow(i,j)<=x; j++) {
          max = Math.max((int)Math.pow(i,j),max);
      }
    }
    System.out.println(x==1?1:max);
  }
}