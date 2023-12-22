import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.length() <= 1) {
            System.out.print(Integer.parseInt(str));
            return;
        }

        if (str.length() <= 2) {
            System.out.print(9);
            return;
        }

        if (str.length() <= 3) {
            System.out.print(9 + Integer.parseInt(str) - 99);
            return;
        }

        if (str.length() <= 4) {
            System.out.print(909);
            return;
        }

        if (str.length() <= 5) {
            System.out.print(909 + Integer.parseInt(str) - 9999);
            return;
        }

        if (str.length() == 6) {
            System.out.print(90909);
            return;
        }
    }

}