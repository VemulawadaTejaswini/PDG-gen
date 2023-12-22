import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] s = br.readLine().toCharArray();
    if (s[2] == s[3] && s[4] == s[5]){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
