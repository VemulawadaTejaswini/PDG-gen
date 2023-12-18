import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        double b = in.nextDouble();
        int bint = (int)Math.round(b * 100);
        long mul = a*bint;
        String ans100 = Long.toString(mul);
        String ans = "0";
        if(ans100.length() > 2) {
            ans = ans100.substring(0, ans100.length()-2);
        }
        System.out.println(ans);
    }
}
