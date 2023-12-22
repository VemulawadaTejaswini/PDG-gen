import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] ary1 = new char[3];
        char[] ary2 = new char[3];
        ary1 = s.toCharArray();
        ary2 = t.toCharArray();
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (ary1[i] == ary2[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}