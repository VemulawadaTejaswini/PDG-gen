import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] line = br.readLine().split(" ");
      int buf = 0;
      Stack stack = new Stack(line.length);

      for (String s : line) {
        switch(s) {
          case "+" :
            buf += stack.pop();
            buf += stack.pop();
            stack.push(buf);
            buf = 0;
            break;

          case "-" :
            buf -= stack.pop();
            buf += stack.pop();
            stack.push(buf);
            buf = 0;
            break;

          case "*" :
            buf  = stack.pop();
            buf *= stack.pop();
            stack.push(buf);
            buf = 0;
            break;

          default :
            stack.push(Integer.parseInt(s));
            break;
        }
      }

      while(!stack.isEmpty())
        buf += stack.pop();
      
      System.out.println(buf);
    }
  }
}

class Stack {
  int[] stack;
  int ite;

  public Stack(int capacity) {
    stack = new int[capacity];
    ite = 0;
  }

  public void initialize() {
    ite = 0;
  }

  public int getIte() {
    return ite;
  }

  public boolean isEmpty() {
    return ite == 0;
  }

  public boolean isFull() {
    return ite >= stack.length-1;
  }

  public  boolean push(int x) {
    if(isFull()) return false;

    stack[++ite] = x;
    return true;
  }

  public int pop() {
    if(isEmpty()) return 0;

    return stack[ite--];

  }
}
