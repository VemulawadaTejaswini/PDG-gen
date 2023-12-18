import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    int N = Integer.parseInt(strs[0]);
    int I = Integer.parseInt(strs[1]);
    
    System.out.println(N - I + 1);
  }
}