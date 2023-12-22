import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        esc:while(true) {
            int a = scn.nextInt();
            String op = scn.next();
            int b = scn.nextInt();
            switch(op) {
              case "+":
                System.out.println(a + b);
                break;
              case "-":
                System.out.println(a - b);
                break;
              case "*":
                System.out.println(a * b);
                break;
              case "/":
                System.out.println(a / b);
                break;
              case "?":
                break esc;
            }
        }
    }
}