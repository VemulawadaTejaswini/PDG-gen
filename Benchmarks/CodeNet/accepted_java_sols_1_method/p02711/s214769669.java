import java.util.*;

class Main {
    public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        boolean flg = false;
        while (i != 0) {
            if (i % 10 == 7) {
                flg = true;
            }
            i /= 10;
        }
        if (flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
