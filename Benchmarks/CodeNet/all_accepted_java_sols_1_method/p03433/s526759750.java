import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
  /**
   * main method.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    
    //支払うN円
    String line = in.readLine();
    int N = Integer.parseInt(line);	
    
    //１円硬貨の枚数
    line = in.readLine();
    int A = Integer.parseInt(line);	
    
    if ((N % 500) <= A) {
    	System.out.println("Yes");
    } else {
    	System.out.println("No");
    }
    
  }
}