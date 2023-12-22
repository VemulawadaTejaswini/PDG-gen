import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder s = new StringBuilder(br.readLine());
    String t = br.readLine();
    
    for(int i = 0; i < s.length(); i++) {
      char c = s.charAt(0);
      s.deleteCharAt(0);
      s.append(c);
      
      if(t.equals(s.toString())) {
        System.out.println("Yes");
        return;
      }
    }
    
    System.out.println("No");
  }
}
