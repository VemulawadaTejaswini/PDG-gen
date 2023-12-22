
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int times = Integer.parseInt(sc.nextLine());
        // int bit = 0;

        String[] s = sc.nextLine().split(" ");

        int x1 = Integer.parseInt(s[0]);
        int x2 = Integer.parseInt(s[1]);
        int x3 = Integer.parseInt(s[2]);

        int cnt = 0;
        String rtn = "No";

        if (x1 < x2) {
            cnt = x1;
            for (int i = x1; i <= x2; i++) {
                if (cnt == x3) {
                    rtn = "Yes";
                    break;
                } else {
                    cnt++;
                }
            }
        } else {
            cnt = x2;
            for (int i = x2; i <= x1; i++) {
                if (cnt == x3) {
                    rtn = "Yes";
                    break;
                } else {
                    cnt++;
                }
            }
        }

        System.out.println(rtn);
        sc.close();
    }
}
