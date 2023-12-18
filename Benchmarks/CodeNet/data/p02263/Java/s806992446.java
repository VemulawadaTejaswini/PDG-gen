import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    LinkedList<Integer> stack = new LinkedList<Integer>();
    while(sc.hasNext()){
      String inp = sc.next();
      if('0' <= inp.charAt(0) && inp.charAt(0) <= '9'){
        int num = Integer.parseInt(inp);
        stack.push(num);
      }else{
        int b = stack.pop();
        int a = stack.pop();
        int c;
        if('+' == inp.charAt(0)){
          c = a + b;
        }else if('*' == inp.charAt(0)){
          c = a * b;
        }else{
          c = a - b;
        }
        stack.push(c);
      }
    }

    System.out.println(stack.pop());
  }
}