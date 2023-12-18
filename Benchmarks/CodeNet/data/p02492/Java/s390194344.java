import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        int result = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            int a = Integer.parseInt(in.next());
            String op = in.next();
            int b = Integer.parseInt(in.next());

            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                case "?":
                    System.exit(1);
            }

        System.out.println(result);
        }
    }
}