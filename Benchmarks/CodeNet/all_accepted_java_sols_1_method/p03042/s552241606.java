import java.util.*;
public class Main {
    public static void main(String[] args) {
        int val;
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
            boolean yymm = false;
            boolean mmyy = false;
            int a = Integer.valueOf(s);

            // yymm
            if (a % 100 <= 12 && 0 < a %100){
                yymm = true;
            }
            if (a / 100 <= 12 && 0 < a / 100){
                mmyy = true;
            }


            if (yymm && mmyy) {
                System.out.println("AMBIGUOUS");
            } else if (yymm) {
                System.out.println("YYMM");
            } else if (mmyy) {
                System.out.println("MMYY");
            } else  {
                System.out.println("NA");
            }
    }
}