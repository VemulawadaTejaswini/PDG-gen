import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    switch (str) {
      case "A" :
        System.out.println("T");
        break;
      case "T" :
        System.out.println("A");
        break;
      case "G" :
        System.out.println("C");
        break;
      case "C" :
        System.out.println("G");
        break;
    }
  }
}