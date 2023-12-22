import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    Stack<String> stack = new Stack<String>();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'B' && !stack.empty()) {
        stack.pop();
      } else if (str.charAt(i) != 'B') {
        stack.push(String.valueOf(str.charAt(i)));
      }
    }
    System.out.println(String.join("",stack));
  }
}