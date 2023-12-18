import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    try {
        var stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        
        // 読み込み
        while((line = stdin.readLine()) == null);
        Integer n = Integer.valueOf(line.split(" ")[0]);
        Integer x = Integer.valueOf(line.split(" ")[1]);
        Integer t = Integer.valueOf(line.split(" ")[2]);
        
        Integer result = (n / x + (n % x == 0 ? 0 : 1)) * t;
        
        System.out.println(result);
    } catch(Exception e) {
    }
   
  }
}