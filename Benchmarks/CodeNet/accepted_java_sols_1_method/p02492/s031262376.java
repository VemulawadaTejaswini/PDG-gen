import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String op = sc.next();
    int b = sc.nextInt();
    int c[] = new int[100];
    int i = 0;

    loop1:
    while(true){
      switch(op){
        case "?":
          break loop1;

        case "+":
          c[i] = a + b;
          i++;
          break;

        case "-":
          c[i] = a - b;
          i++;
          break;

        case "*":
          c[i] = a * b;
          i++;
          break;

        case "/":
          c[i] = a / b;
          i++;
          break;

        default:
          System.out.println("Input a op b.");
          break;
      }
      a = sc.nextInt();
      op = sc.next();
      b = sc.nextInt();
    }

    for(int j = 0; j<i; j++){
      System.out.println(c[j]);
    }
  }
}