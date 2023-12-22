import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int c = 0;
    while(c == 0){
      int a = sc.nextInt();
      String op = sc.next();
      int b = sc.nextInt();
      if (op.equals("+")){
        System.out.println(a + b);
      }else if (op.equals("-")){
        System.out.println(a - b);
      }else if (op.equals("*")){
        System.out.println(a * b);
      }else if (op.equals("/")){
        System.out.println(a / b);
      }else if (op.equals("?")){
        c++;
      }else{
        System.out.println("Error.");
      }
    }
  }
}

