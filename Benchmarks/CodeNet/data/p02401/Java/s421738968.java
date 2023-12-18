import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String op = "num";
        int cal = 0;

        while(true) {

            int a = sc.nextInt();
            op = sc.next();
            int b = sc.nextInt();

            if (op .equals("?")) break;
            else if (op .equals("+")) cal = a + b;
            else if (op .equals("-")) cal = a - b;
            else if (op .equals("*")) cal = a * b;
            else if (op .equals("/")) cal = a / b;

            System.out.println(cal);

        }

        sc.close();
    }
}
