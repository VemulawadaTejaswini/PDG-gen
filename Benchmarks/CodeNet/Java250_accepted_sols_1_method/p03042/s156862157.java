import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans;
        int s1 = Integer.parseInt(s.substring(0, 2));
        int s2 = Integer.parseInt(s.substring(2, 4));
        if (1 <= s1 && s1 <= 12) {
            ans = "MMYY";
            if (1 <= s2 && s2 <= 12) {
                ans = "AMBIGUOUS";
            }
        } else if (1 <= s2 && s2 <= 12) {
            ans = "YYMM";
        } else {
            ans = "NA";
        }
        System.out.println(ans);
    }
}