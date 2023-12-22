import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        char[] Sarr = S.toCharArray();
        char[] Tarr = T.toCharArray();

        int ans = 0;
        for (int i=0;i<S.length();i++) {
            if (Sarr[i] == Tarr[i]) ans++;
        }

        System.out.println(ans);
    }
}
