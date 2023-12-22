import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int a = 0;
        int b = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.substring(i, i + 1).equals("0")) {
                a++;
            } else {
                b++;
            }
        }
        if (a == 0 || b == 0) {
            System.out.println(0);
        } else {
            System.out.println(Math.min(2 *a , 2 * b));
        }

    }

}