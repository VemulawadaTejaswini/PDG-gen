import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        String S1 = S.substring(0, 2);
        String S2 = S.substring(2, 4);
        if (isYYMM(S1, S2) && isMMYY(S1, S2)) {
            System.out.println("AMBIGUOUS");
        } else if (isYYMM(S1, S2)) {
            System.out.println("YYMM");
        } else if (isMMYY(S1, S2)) {
            System.out.println("MMYY");
        } else {
            System.out.println("NA");
        }
    }
    public static boolean isYear(String S) {
        int yy = Integer.valueOf(S);
        if (0 <= yy && yy <= 99) {
            return true;
        }
        return false;
    }
    public static boolean isMonth(String S) {
        int mm = Integer.valueOf(S);
        if (1 <= mm && mm <= 12) {
            return true;
        }
        return false;
    }
    public static boolean isYYMM(String S, String T) {
        if (isYear(S) && isMonth(T)) {
            return true;
        }
        return false;
    }
    public static boolean isMMYY(String S, String T) {
        if (isMonth(S) && isYear(T)) {
            return true;
        }
        return false;
    }
}
