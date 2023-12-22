import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int zero = 0;
        int one = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zero++;
            }else {
                one++;
            }
        }
        int ans = one + zero;
        if (zero < one) {
            ans += zero- one;
        } else {
            ans +=one - zero;
        }
        System.out.println(ans);
    }
}