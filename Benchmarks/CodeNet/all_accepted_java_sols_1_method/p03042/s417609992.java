import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int first = Integer.parseInt(s.substring(0, 2));
        int second = Integer.parseInt(s.substring(2, 4));
        String r = null;
        if(1<=first && first<=12) {
            if(1<=second && second <= 12) {
                r = "AMBIGUOUS";
            }
            else {
                r = "MMYY";
            }
        }
        else {
            if(1<=second && second <= 12) {
                r = "YYMM";
            }
            else {
                r = "NA";
            }
        }
        System.out.println(r);
    }
}
