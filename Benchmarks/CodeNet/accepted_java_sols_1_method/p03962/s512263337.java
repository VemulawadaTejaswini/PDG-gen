import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a == b && a == c && b == c) {
            System.out.println(1);
        } else if (a != b && a == c && b == c) {
            System.out.println(2);
        } else if (a == b && a != c && b == c) {
            System.out.println(2);
        } else if (a == b && a == c && b != c) {
            System.out.println(2);
        } else if (a != b && a != c && b == c) {
            System.out.println(2);
        } else if (a != b && a == c && b != c) {
            System.out.println(2);
        } else if (a == b && a != c && b != c) {
            System.out.println(2);
        } else if (a != b && a != c && b != c) {
            System.out.println(3);
        }
        

        sc.close();
    }
}