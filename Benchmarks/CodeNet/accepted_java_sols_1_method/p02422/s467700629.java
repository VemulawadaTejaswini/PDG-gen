import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            String op = sc.next();
            if (op.equals("replace")) {
                StringBuilder sb1 = new StringBuilder();
                sb1.append(str).replace(sc.nextInt(), sc.nextInt() + 1, sc.next());
                str = sb1.toString();
            } else if (op.equals("reverse")) {
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                int a = sc.nextInt(), b = sc.nextInt() + 1;
                sb2.append(str).replace(a, b, sb1.append(str.substring(a, b)).reverse().toString());
                str = sb2.toString();
            } else {
                System.out.println(str.substring(sc.nextInt(), sc.nextInt() + 1));
            }
        }
    }
}