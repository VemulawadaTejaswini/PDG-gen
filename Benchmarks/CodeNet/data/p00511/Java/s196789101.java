import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        while (true) {
            String op = s.nextLine();
            if (op.equals("=")) break;
            int arg = Integer.parseInt(s.nextLine());
            if (op.equals("+")) n += arg;
            if (op.equals("-")) n -= arg;
            if (op.equals("*")) n *= arg;
            if (op.equals("/")) n /= arg;
        }
        System.out.println(n);
    }
}

