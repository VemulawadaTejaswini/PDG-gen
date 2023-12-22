import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdId = new Scanner(System.in);
        int a = stdId.nextInt();
        int b = stdId.nextInt();
        int c = stdId.nextInt();
        int tmp = 0;

        String j = "No";

        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (a > c) {
            tmp = a;
            a = c;
            c = tmp;
        }
        if (b > c) {
            tmp = b;
            b = c;
            c = tmp;
        }

        System.out.println(a + " " + b + " " + c);

    }
}