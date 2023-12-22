import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] stri = str.split(" ");
    Stack<Integer> st = new Stack<Integer>();
    for (int i = 0; i < stri.length; i++) {
      int i1, i2;
      switch (stri[i]) {
        case "+":
          i1 = st.pop();
          i2 = st.pop();
          st.push(i1 + i2);
          break;
        case "-":
          i1 = st.pop();
          i2 = st.pop();
          st.push(i2 - i1);
          break;
        case "*":
          i1 = st.pop();
          i2 = st.pop();
          st.push(i1 * i2);
          break;
        default:
          st.push(Integer.parseInt(stri[i]));
      }
    }
    System.out.println(st.pop());
  }
}