import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            switch(op){
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
              case "?":
                  return;
            }
        }
    }
}

