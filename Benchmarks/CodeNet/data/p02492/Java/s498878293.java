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

            if (op.equals("+")) {
                result = a + b;
            } else if (op.equals("-")) {
                result = a - b;
            } else if (op.equals("*")) {
                result = a * b;
            } else if (op.equals("/")) {
                result = a / b;
            } else if (op.equals("?")) {
                break;
            }

            System.out.println(result);
        }
    }
}