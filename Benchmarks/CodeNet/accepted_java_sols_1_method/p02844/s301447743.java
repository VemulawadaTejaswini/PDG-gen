
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        String s = scan.next();
        scan.close();

        int ans = 0;
        boolean flagI = false;
        boolean flagJ = false;
        for (char i = '0'; i <= '9'; i++) {
            for (char j = '0'; j <= '9'; j++) {
                for (char k = '0'; k <= '9'; k++) {
                    for (int a = 0; a < n; a++) {
                        if (s.charAt(a) == i && !flagI) {
                            flagI = true;
                            continue;
                        }
                        if (s.charAt(a) == j && flagI && !flagJ) {
                            flagJ = true;
                            continue;
                        }
                        if (s.charAt(a) == k && flagI && flagJ) {
                            ans++;
                            break;
                        }
                    }
                    flagI = false;
                    flagJ = false;
                }
            }
        }

        System.out.println(ans);
    }
}
