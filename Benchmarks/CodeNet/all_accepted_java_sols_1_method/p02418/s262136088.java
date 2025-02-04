import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
  public static void main(String[] args) throws IOException {
     
    try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
      String result = "No";
      String inStr  = br.readLine();
      String target = br.readLine();
      String ring = inStr + inStr;
 
      if( inStr.length() >= target.length()) {
        if( ring.indexOf(target) != -1) result = "Yes";
      }
 
      System.out.println(result);
    }
  }
}
