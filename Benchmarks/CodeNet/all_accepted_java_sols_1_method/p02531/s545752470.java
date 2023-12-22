import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    Stack<String> st = new Stack<String>();
    String must;
    while(!(must = scan.next()).equals("quit")){
      if(must.equals("push")){
        String x = scan.next();
        st.push(x);
      }else{
        out.println(st.pop());
      }
    }
  }
}