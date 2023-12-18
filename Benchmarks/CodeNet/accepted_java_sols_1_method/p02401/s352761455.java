import java.util.Scanner;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b;
    String str;
    while(true){
      a = sc.nextInt();
      str = sc.next();
      b = sc.nextInt();

      if(str.equals("?")) break;

      switch(str){
        case "+":
        System.out.println(a+b);
        break;

        case "-":
        System.out.println(a-b);
        break;

        case "*":
        System.out.println(a*b);
        break;

        case "/":
        System.out.println(a/b);
        break;
      }//switch

    }//while
  }

}
