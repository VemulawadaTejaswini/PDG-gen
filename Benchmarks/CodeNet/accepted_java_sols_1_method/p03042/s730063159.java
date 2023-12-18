import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Integer s = sc.nextInt();
        Integer preI = s / 100;
        Integer endI = s % 100;
        boolean isPrePossibleM = 1 <= preI && preI <=12;
        boolean isEndPossibleM = 1 <= endI && endI <=12;
        if (isPrePossibleM) {
            if (isEndPossibleM) {
                System.out.println("AMBIGUOUS");
            } else {
                System.out.println("MMYY");
            }
        } else {
            if (isEndPossibleM) {
                System.out.println("YYMM");
            } else {
                System.out.println("NA");
            }
        }
    }
}