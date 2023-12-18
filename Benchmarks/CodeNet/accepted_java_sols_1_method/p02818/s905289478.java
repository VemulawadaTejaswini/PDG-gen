import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = Long.parseLong(scan.next());
        long b = Long.parseLong(scan.next());
        long k = Long.parseLong(scan.next());
        scan.close();

        long ta = a;
        long ao = b;

        if (k >= ta) {
            k -= ta;
            ta = 0;
        } else {
            ta -= k;
            System.out.println(ta + " " + ao);
            return;
        }

        if (k >= ao) {
            System.out.println(0 + " " + 0);
        } else {
            ao -= k;
            System.out.println(ta + " " + ao);
        }

    }

}
