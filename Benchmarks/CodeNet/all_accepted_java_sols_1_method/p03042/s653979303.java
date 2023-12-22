import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int s = kbd.nextInt();
        int a = s / 100;
        int b = s % 100;
        if ((0 < a && a < 13) && (0 < b && b < 13)) {
            System.out.println("AMBIGUOUS");
        } else if (0 < a && a < 13) {
            System.out.println("MMYY");
        } else if (0 < b && b < 13) {
            System.out.println("YYMM");
        } else {
            System.out.println("NA");
        }
    }
}