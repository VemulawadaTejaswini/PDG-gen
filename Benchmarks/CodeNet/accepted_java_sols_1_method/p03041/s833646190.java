import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    int n = 0;
    int k = 0;
    char[] s = null;
    
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String[] nk = br.readLine().split("\\s");
      n = Integer.parseInt(nk[0]);
      k = Integer.parseInt(nk[1]);
      s = br.readLine().toCharArray();
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    s[k-1] = Character.toLowerCase(s[k-1]);
    System.out.print(String.valueOf(s));
  }
}