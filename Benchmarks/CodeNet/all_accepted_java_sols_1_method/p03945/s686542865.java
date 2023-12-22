import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        String tmp = s.substring(0, 1);
        for (int i = 1; i < s.length(); i++) {
            if(!s.substring(i, i + 1).equals(tmp)) {
                ans++;
                tmp = s.substring(i, i + 1);
            }
        }
        System.out.println(ans);
    }
}