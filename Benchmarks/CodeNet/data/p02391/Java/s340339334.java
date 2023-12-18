import java.util.*;

public class Main {

    public static void main(String arg[]) {
        try {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (-1001 < a && a < 1001 && -1000 < b && b < 1001) {
                if (a > b) {
                    System.out.println("a > b");
                } else if (a < b) {
                    System.out.println("a < b");
                } else {
                    System.out.println("a == b");
                }
            } else {
                System.out.println("1??????100?????§???????????§???");
            }

        } catch (InputMismatchException ex) {
            System.out.println("1??????100?????§????????¶??°?????\?????????????????????");
        }
    }
}