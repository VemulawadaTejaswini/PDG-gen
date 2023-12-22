import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split("");
    for (int i = str.length-1; i >=0; i--) {
      System.out.print(str[i]);
    }
    System.out.println();
  }
}