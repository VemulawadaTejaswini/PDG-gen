import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    char[] s = br.readLine().toCharArray();
    
    for (int i=0; i<s.length; i++) {
      s[i] = (char) ((s[i]-'A'+n)%26+'A');
    }
    System.out.println(new String(s));
  }
}
