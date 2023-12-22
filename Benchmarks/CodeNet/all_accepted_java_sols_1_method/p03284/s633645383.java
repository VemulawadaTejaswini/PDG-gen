import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    int N = Integer.parseInt(strs[0]);
    int K = Integer.parseInt(strs[1]);
    
    System.out.println(N % K == 0 ? 0 : 1);
  }
}