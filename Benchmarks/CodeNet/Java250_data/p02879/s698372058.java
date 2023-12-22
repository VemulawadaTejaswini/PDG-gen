import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    execute();
  }

  private static void execute() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    int a = Integer.parseInt(line.split(" ")[0]);
    int b = Integer.parseInt(line.split(" ")[1]);

    System.out.println(calc(a, b));
  }

  private static int calc(int a, int b) {
    if(a > 9 || b > 9){
      return  -1;
    }
    return a * b;
  }
}
