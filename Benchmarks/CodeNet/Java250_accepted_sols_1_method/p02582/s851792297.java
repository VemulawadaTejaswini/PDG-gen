import java.util.Scanner;

public class Main {
    public static Scanner Scan = new Scanner(System.in);
    public static void main(String[] args) {
        String s;
        s = Scan.next();

        int cnt = 0, ans = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'R') cnt++;
            else cnt = 0;
            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}