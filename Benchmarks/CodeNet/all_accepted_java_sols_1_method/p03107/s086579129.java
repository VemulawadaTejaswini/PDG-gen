import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int n = s.length();
        int cnt0 = 0;
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            char target = s.charAt(i);
            if (target == '0') {
                cnt0++;
            } else {
                cnt1++;
            }
        }
        int ans = Math.min(cnt0, cnt1);
        System.out.println(ans * 2);
    }
}