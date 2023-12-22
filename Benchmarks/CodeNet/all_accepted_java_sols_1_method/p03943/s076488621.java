import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    boolean f = false;
    int sum = 0;
    
    for (String s : strs) {
      sum += Integer.parseInt(s);
    }
    
    for (int i = 0; i < strs.length; i++) {
      for (int j = i + 1; j < strs.length; j++) {
        if (sum/2 == Integer.parseInt(strs[i]) + Integer.parseInt(strs[j])) {
          f = true;
        }
      }
    }
    if (f) System.out.println("Yes");
    else System.out.println("No");
  }
}