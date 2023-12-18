import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        String op = sc.next();
        Long b = sc.nextLong();

        if ("+".equals(op)) {
            System.out.println(a + b);
        } else if ("-".equals(op)) {
            System.out.println(a - b);
        }
    }

}
