import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        int result = 0;
        if (b % a == 0) {
            result = a + b;
        } else {
            result = b - a;
        }

        System.out.println(result);
    }
}