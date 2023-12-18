import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = "";
        String ans = "";
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            a = s.substring(0, 1);
            sum = Integer.parseInt(a);
            ans = a;
            for (int j = 0; j < s.length() - 1; j++) {
                a = s.substring(j + 1, j + 2);
                if ((i >> j & 1) == 0) {
                    ans += "+" + a;
                    sum += Integer.parseInt(a);
                } else {
                    ans += "-" + a;
                    sum -= Integer.parseInt(a);
                }
            }
            if (sum == 7) {
                System.out.println(ans + "=7");
                break;
            }
        }
    }
}
