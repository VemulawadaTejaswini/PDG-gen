import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        long ans = 0;
        for (int bit = 0; bit < (1 << (len - 1)); bit++) {
            long sum = 0;
            long tmp = (int) (s.charAt(0) - '0');
            for (int i = 0; i < len - 1; i++) {
                // 0なら+ではない
                if ((bit & (1 << i)) != 0) {
                    sum += tmp;
                    tmp = (int) (s.charAt(i + 1) - '0');
                } else {
                    tmp *= 10;
                    tmp = tmp + (int) (s.charAt(i + 1) - '0');
                }
            }
            sum += tmp;
            ans += sum;
        }
        System.out.println(ans);

        sc.close();
    }
}
