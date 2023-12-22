import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        final int likeNum = 753;
        int ans = 10000;
        for (int i = 0; i < s.length() - 2; i++) {
            int subNum = Integer.parseInt(s.substring(i, i+3));
            int abs = Math.abs(likeNum - subNum);
            ans = (abs < ans)? abs : ans ;
        }
        System.out.println(ans);

    }
}