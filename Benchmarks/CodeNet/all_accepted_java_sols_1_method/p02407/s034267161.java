import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{

  public static void main(String[] args) throws IOException {
    try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {

      StringBuilder result = new StringBuilder();
      String[] lines = br.readLine().split(" ");
      int n = Integer.parseInt(lines[0]);
      lines = br.readLine().split(" ");

      for(int i = n-1; i >= 0; i--){
        result.append(lines[i]);
        if(i != 0) result.append(" ");
      }
      System.out.println(result);
    }
  }
}
