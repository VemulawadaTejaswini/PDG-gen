import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        String op;
        while(true){
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
            
            switch (op) {
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
                    sc.close();
                    return;
            }
        }
    }
}
