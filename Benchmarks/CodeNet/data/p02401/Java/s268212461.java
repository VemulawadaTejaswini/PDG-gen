import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);
    while (true) {
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        if ("?".equals(op)) break;
        Map<String, Integer> result = new HashMap<>();
        result.put("+", a + b);
        result.put("-", a - b);
        result.put("*", a * b);
        result.put("/", b != 0 ? a / b : 0);
        pw.append(String.valueOf(result.get(op)));
        pw.append("\n");
    }
    pw.flush();
  }
}
