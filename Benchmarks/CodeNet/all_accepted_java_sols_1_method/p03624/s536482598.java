import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        sc.close();

        boolean flg = false;
        String ans = "None";

        for (char c = 'a'; c <= 'z'; c++) {
            if (x.indexOf(c) != -1) {
                continue;
            } else {
                flg = true;
                ans = String.valueOf(c);
                break;
            }
        }

        if (flg) {
            System.out.println(ans);
        } else {
            System.out.println(ans);
        }
    }
}