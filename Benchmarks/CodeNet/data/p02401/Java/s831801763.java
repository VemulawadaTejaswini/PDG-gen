import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       while(true)
       {
           Scanner sc = new Scanner(System.in);

           int a = sc.nextInt();

           String op1 = sc.next();
           char op = op1.charAt(0);

           int b = sc.nextInt();

          if (op=='+')
              System.out.println(a+b);
          else if (op=='-')
              System.out.println(a-b);
          else if (op=='*')
              System.out.println(a*b);
          else if (op=='/')
              System.out.println(a/b);
          else if (op=='?')
              break;

       }

    }
}

