import java.util.Scanner;
public class Main {
  static int top = 0;
  static int[] number = new int[200];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] str = s.split(" ",0);
    for(int i = 0; i<str.length; i++){
      if(str[i].equals("+")) {
        int a = pop();
        int b = pop();
        push(b+a);
        continue;
      }
      if(str[i].equals("-")) {
        int a = pop();
        int b = pop();
        push(b-a);
        continue;
      }
      if(str[i].equals("*")) {
        int a = pop();
        int b = pop();
        push(b*a);
        continue;
      }
      push(Integer.parseInt(str[i]));
    }
    System.out.println(pop());
  }
  public static int pop() {
    top--;
    return number[top+1];
  }
  public static void push(int i) {
    top++;
    number[top] = i;
  }
}