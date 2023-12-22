import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        if (x.charAt(0) == 'R') {
            if (x.charAt(1) == 'R') {
                if (x.charAt(2) == 'R') {
                    System.out.println(3);
                    return;
                }
                System.out.println(2);
                return;
            }
            System.out.println(1);
            return;
        }

        if (x.charAt(1) == 'R') {
            if (x.charAt(2) == 'R') {
                System.out.println(2);
                return;
            }
            System.out.println(1);
            return;
        }

        if (x.charAt(2) == 'R') {
            System.out.println(1);
            return;
        }

        System.out.println(0);

        sc.close();

        }

    }

