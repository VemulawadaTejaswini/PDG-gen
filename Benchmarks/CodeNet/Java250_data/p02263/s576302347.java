
import java.util.Scanner;

class Main{
  int[] a = new int[200];
  int top;

  Main(){
    top = 0;
  }

  void push(int x){
    a[++top] = x;
  }

  int pop(){
    return a[top--];
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    Main stack = new Main();


    while(stdIn.hasNext()){
      String input = stdIn.next();

      if(input.equals("+")){
        int a = stack.pop();
        int b = stack.pop();
        stack.push(a + b);
      }
      else if(input.equals("*")){
        int a = stack.pop();
        int b = stack.pop();
        stack.push(a * b);
      }
      else if(input.equals("-")){
        int b = stack.pop();
        int a = stack.pop();
        stack.push(a-b);
      }
      else
        stack.push(Integer.parseInt(input));

    }


    System.out.println(stack.pop());
  }
}