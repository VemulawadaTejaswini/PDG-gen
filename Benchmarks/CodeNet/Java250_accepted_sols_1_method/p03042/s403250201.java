import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        int tmpMonth = Integer.parseInt(S.substring(0, 2));
        if (tmpMonth <= 0 || tmpMonth > 12) {
            tmpMonth = Integer.parseInt(S.substring(2, 4));
            if (tmpMonth <= 0 || tmpMonth > 12) {
                System.out.println("NA");
            } else {
                System.out.println("YYMM");
            }
        } else {
            tmpMonth = Integer.parseInt(S.substring(2, 4));
            if (tmpMonth <= 0 || tmpMonth > 12) {
                System.out.println("MMYY");
            } else {
                System.out.println("AMBIGUOUS");
            }
        }
    }
}
