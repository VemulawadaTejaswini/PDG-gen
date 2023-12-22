import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i1 = Integer.parseInt(s.substring(0, 2));
        boolean isMM1 = (1 <= i1 && i1 <= 12);
        int i2 = Integer.parseInt(s.substring(2, 4));
        boolean isMM2 = (1 <= i2 && i2 <= 12);

        if (isMM1 && isMM2) {
            System.out.println("AMBIGUOUS");
        } else if (!isMM1 && !isMM2) {
            System.out.println("NA");
        } else if (isMM1) {
            System.out.println("MMYY");
        } else {
            System.out.println("YYMM");
        }
    }
}
