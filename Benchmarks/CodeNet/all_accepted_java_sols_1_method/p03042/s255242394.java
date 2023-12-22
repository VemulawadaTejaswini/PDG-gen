import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int a = Integer.parseInt(s.substring(0, 2));
        int b = Integer.parseInt(s.substring(2, 4));
        if (a >= 1 && a <= 12) {
            if (b >= 1 && b <= 12) {
                System.out.println("AMBIGUOUS");
            } else {
                System.out.println("MMYY");
            }
        } else {
            if (b >= 1 && b <= 12) {
                System.out.println("YYMM");
            } else {
                System.out.println("NA");
            }
        }
    }
}
