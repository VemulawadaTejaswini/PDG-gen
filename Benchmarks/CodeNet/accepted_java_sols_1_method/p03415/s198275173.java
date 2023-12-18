import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[3];
        for (int i = 0 ; i < 3 ; i++) {
            s[i] = sc.next();
        }
        String ans = "";
        ans += s[0].substring(0, 1) + s[1].substring(1, 2) + s[2].substring(2, 3);
        System.out.println(ans);
    }

}