import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder builder = new StringBuilder(scan.next());
//        String str = scan.next();
        int q = scan.nextInt();
        String command = "";

        for (int i = 0; i < q; i++) {
            command = scan.next();
            int a = scan.nextInt();
            int b = scan.nextInt() + 1;
            if (command.equals("replace")) {
                String p = scan.next();
                builder = builder.replace(a, b, p);
            } else if (command.equals("reverse")) {
                StringBuilder tmp = new StringBuilder(builder.substring(a, b));
                String tmp2 = tmp.reverse().toString();
                builder = builder.replace(a, b, tmp2);
            } else if (command.equals("print")) {
                System.out.println(builder.substring(a, b));
            }
        }
    }
}