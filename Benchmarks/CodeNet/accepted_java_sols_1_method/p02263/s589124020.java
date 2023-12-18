import java.util.Scanner;
import java.util.Stack;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Stack<Integer> main = new Stack<>();

    while(scan.hasNext()) {
      String inputString = scan.next();
      char[] input = inputString.toCharArray();
      if(input[0]>='0'&&input[0]<='9') {
        main.push(Integer.parseInt(inputString));
      }else {
        if(input[0]=='+') {
          main.push(main.pop()+main.pop());
        }else if(input[0]=='-') {
          main.push(-main.pop()+main.pop());
        }else {
          main.push(main.pop()*main.pop());
        }
      }
    }
    System.out.println(main.pop());
  }
}