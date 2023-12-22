import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    while(true){
      int a = scanner.nextInt();
      char x = scanner.next().charAt(0);
      int b = scanner.nextInt();
      if(x == '?') break;
      switch(x){
        case '+':
          System.out.println(a + b);
          break;
        case '-':
          System.out.println(a - b);
          break;
        case '*':
          System.out.println(a * b);
          break;
        case '/':
          System.out.println(a / b);
          break;
        default:
          break;
        }
      }
  }
}