import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = s.charAt(i) - '0';
        }
        for (int bit = 0; bit < (1 << 3); bit++) {
            int sum = num[0];
            String ans = "" + num[0];
            for (int j = 0; j < 3; j++) {
                if ((bit & (1 << j)) != 0) {
                    sum += num[j + 1];
                    ans += "+" + num[j + 1];
                } else {
                    sum -= num[j + 1];
                    ans += "-" + num[j + 1];
                }
            }
            if (sum == 7) {
                ans += "=7";
                System.out.println(ans);
                return;
            }
        }
    }
}
