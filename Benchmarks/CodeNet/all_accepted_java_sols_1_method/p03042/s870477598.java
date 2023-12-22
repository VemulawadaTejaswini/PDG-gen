
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int a =  10 * (Integer.valueOf(s[0]) -48)  + Integer.valueOf(s[1]) - 48;
        int b = 10 * (Integer.valueOf(s[2]) -48)  + Integer.valueOf(s[3]) - 48;


        if (a == 0) {
            if (b > 0 &&  b <= 12) {
                System.out.println("YYMM");
            } else {
                System.out.println("NA");
            }
        } else if (a > 0 && a <= 12){
            if (b == 0) {
                System.out.println("MMYY");
            } else if (b > 0 && b <= 12) {
                System.out.println("AMBIGUOUS");
            } else {
                System.out.println("MMYY");
            }
        } else {
            if (b == 0 ) {
                System.out.println("NA");
            } else if (b > 0 && b <= 12) {
                System.out.println("YYMM");
            } else {
                System.out.println("NA");
            }
        }
    }
}