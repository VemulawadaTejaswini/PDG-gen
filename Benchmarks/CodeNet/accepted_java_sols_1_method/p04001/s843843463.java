import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        long ans = 0;

        for(int b=0; b<(1<<n-1); b++) {
            long tmp = 0;
            for(int i=0; i<n; i++) {
                tmp *= 10;
                tmp += s.charAt(i) - '0';
                if((b >> i & 1) == 0) {
                    ans += tmp;
                    tmp = 0;
                }
            }
            ans += tmp;
        }
        System.out.println(ans);
    }
}
