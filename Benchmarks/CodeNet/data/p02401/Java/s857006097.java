import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            String o = sc.next();
            int b = sc.nextInt();

            if(o.equals("?"))break;
            switch (o){
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
            }
            sc.nextLine();
        }
    }
}
