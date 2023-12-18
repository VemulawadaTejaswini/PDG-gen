import java.util.Scanner;

public class symple_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();

        while(op != "?")
        {
            if(op == "+")
                System.out.println(a + b);
            if(op == "-")
                System.out.println(a - b);
            if(op == "*")
                System.out.println(a * b);
            if(op == "/")
                System.out.println(a / b);

            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
        }
    }
}
