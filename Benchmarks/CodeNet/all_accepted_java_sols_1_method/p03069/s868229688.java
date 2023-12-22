import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int nWhited = 0;
        int nBlacked = 0;
        for (char s : S.toCharArray()) {
            nBlacked += s == '.' ? 1 : 0;
        }

        int nChanged = nBlacked;
        for (char s : S.toCharArray()) {
            if (s == '#') {
                nWhited += 1;
            } else {
                nBlacked -= 1;
            }

            if (nChanged > nWhited + nBlacked) {
                nChanged = nWhited + nBlacked;
            }
        }

        System.out.println(nChanged);
    }

}
