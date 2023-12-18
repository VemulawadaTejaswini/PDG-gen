import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String line;
      Deque<Character> que = new ArrayDeque<>();
      StringBuilder buf = new StringBuilder();
      while(true) {
        line = in.readLine();

        if(line.charAt(0) == '.') break;

        boolean isBalanced = true;
        for (char ch : line.toCharArray()) {
          if(ch == '(' || ch == '[') {
            que.push(ch);
          }
          else if(ch == ')' || ch == ']') {
            if(que.isEmpty()) {
              isBalanced = false;
              break;
            }
            else {
              char ec = que.pop();
              if(ec == '(' && ch == ')') continue;
              else if(ec == '[' && ch == ']') continue;
              else {
                isBalanced = false;
                break;
              }
            }
          }
        }

        if(!que.isEmpty()) {
          isBalanced = false;
          que.clear();
        }

        buf.append(isBalanced ? "yes\n" : "no\n");
      }

      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}
