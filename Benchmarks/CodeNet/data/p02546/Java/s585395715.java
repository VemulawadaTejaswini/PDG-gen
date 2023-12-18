import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        char y = x.charAt(x.length() - 1);

        if (y == 's') {
            System.out.println(x + "es");
        } else {
            System.out.println(x + "s");
        }

        sc.close();

        }

    }

