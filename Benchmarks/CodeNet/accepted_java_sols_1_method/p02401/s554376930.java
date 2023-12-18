import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

       while(sc.hasNext())
       {
           int a = sc.nextInt( );

           String op1 = sc.next();
           char op = op1.charAt(0);

           int b = sc.nextInt( );

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

