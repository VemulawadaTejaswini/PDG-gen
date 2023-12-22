import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int L = Integer.parseInt(str.substring(0,2));
        int R = Integer.parseInt(str.substring(2,4));
        if (L >= 1 && L <= 12) {
            if (R >= 1 && R <= 12) {
                System.out.println("AMBIGUOUS");
            } else {
                System.out.println("MMYY");
            }
        } else {
            if (R >= 1 && R <= 12) {
                System.out.println("YYMM");
            } else {
                System.out.println("NA");
            }
        }
    }
}