import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int format = Integer.parseInt(S);
        int left = format / 100;
        int right = format % 100;

        if (left >= 1 && left <= 12) {
            if (right >= 1 && right <= 12) {
                System.out.println("AMBIGUOUS");
            } else {
                System.out.println("MMYY");
            }
        } else if (right >= 1 && right <= 12) {
            System.out.println("YYMM");
        } else {
            System.out.println("NA");
        }

    }
}
