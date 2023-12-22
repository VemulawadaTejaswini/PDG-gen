import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        long k = sc.nextLong();

        for (int i = 0; i < str.length(); i++) {
            if (i == k-1) {
                System.out.println(str.charAt(i));
                return;
            }
            if (str.charAt(i) != '1') {
                System.out.println(str.charAt(i));
                return;
            }
        }
    }
}