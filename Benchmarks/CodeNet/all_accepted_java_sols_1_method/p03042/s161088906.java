import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split("");

        int a = Integer.parseInt(s[0] + s[1]);
        int b = Integer.parseInt(s[2] + s[3]);

        boolean flgA = false;
        boolean flgB = false;

        if (1 <= a && a <= 12) {
            flgA = true;
        }

        if (1 <= b && b <= 12) {
            flgB = true;
        }

        sc.close();

        if (!flgA && flgB) {
            System.out.println("YYMM");
        } else if (flgA && !flgB) {
            System.out.println("MMYY");
        } else if (flgA && flgB) {
            System.out.println("AMBIGUOUS");
        } else {
            System.out.println("NA");
        }
    }
}