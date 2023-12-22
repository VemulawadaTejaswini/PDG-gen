import java.util.*;

public class Main {

    public static void main(String arg[]) {
        try {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if ( 0<= a && a<101 && 0<= b && b<101 && 0<= c && c<101) {
                if (a < b && b < c) {
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            } else {
                System.out.println("1??????100?????§???????????§???");
            }

        } catch (InputMismatchException ex) {
            System.out.println("1??????100?????§????????¶??°?????\?????????????????????");
        }
    }
}