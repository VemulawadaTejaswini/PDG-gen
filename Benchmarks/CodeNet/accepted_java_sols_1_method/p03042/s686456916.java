import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int s = scanner.nextInt();
        boolean yymm = false;
        boolean mmyy = false;

        if (s % 100 <= 12 && s % 100 > 0) {
            yymm = true;
        }
        if (s / 100 <= 12 && s / 100 > 0) {
            mmyy = true;
        }

        if (yymm && mmyy) {
            System.out.println("AMBIGUOUS");
        } else if (yymm) {
            System.out.println("YYMM");
        } else if (mmyy) {
            System.out.println("MMYY");
        } else {
            System.out.println("NA");
        }
    }
}