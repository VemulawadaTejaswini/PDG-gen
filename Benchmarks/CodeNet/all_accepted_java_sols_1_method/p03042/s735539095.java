import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        String s1 = s.substring(0, 2);
        String s2 = s.substring(2, 4);
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        String result = (i1 > 0 && i1 <= 12) ? (i2 > 0 && i2 <= 12) ? "AMBIGUOUS" : "MMYY"
                : (i2 > 0 && i2 <= 12) ? "YYMM" : "NA";
        System.out.println(result);
    }
}