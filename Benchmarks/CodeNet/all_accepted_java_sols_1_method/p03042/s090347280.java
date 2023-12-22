import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int forward = Integer.parseInt(s.substring(0, 2));
        int back = Integer.parseInt(s.substring(2));

        String result = "NA";
        if (forward <= 12 && forward > 0 && back <= 12 && back > 0) {
            result = "AMBIGUOUS";
        } else if (back <= 12 && back > 0) {
            result = "YYMM";
        } else if (forward <= 12 && forward > 0) {
            result = "MMYY";
        }

        System.out.println(result);
    }
}