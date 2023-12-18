import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int s1 = Integer.parseInt(s.substring(0, 2));
        int s2 = Integer.parseInt(s.substring(2));
        if ((s1 == 0 || s1 > 12) && (s2 == 0 || s2 > 12)) {
            System.out.println("NA");
        } else if (s1 == 0 || s1 > 12) {
            System.out.println("YYMM");
        } else if (s2 == 0 || s2 > 12) {
            System.out.println("MMYY");
        } else {
            System.out.println("AMBIGUOUS");
        }
    }
}