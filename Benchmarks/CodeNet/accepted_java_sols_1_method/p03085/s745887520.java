import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    Map<String, String> base = new HashMap<>();
    base.put("A","T");
    base.put("T","A");
    base.put("C","G");
    base.put("G","C");

    String in = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
      in = br.readLine();
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    System.out.print(base.get(in));

  }
}
