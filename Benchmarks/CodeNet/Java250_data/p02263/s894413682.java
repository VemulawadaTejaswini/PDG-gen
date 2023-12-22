
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
    String[] input = stdIn.nextLine().split(" ");
    Main stack = new Main();

    for(int i = 0; i < input.length; i++){
      String s = input[i];

      if(s.equals("+")){
        int a = stack.pop();
        int b = stack.pop();
        stack.push(a + b);
      }
      else if(s.equals("*")){
        int a = stack.pop();
        int b = stack.pop();
        stack.push(a * b);
      }
      else if(s.equals("-")){
        int b = stack.pop();
        int a = stack.pop();
        stack.push(a-b);
      }
      else
        stack.push(Integer.parseInt(s));

    }


    System.out.println(stack.pop());
  }
}