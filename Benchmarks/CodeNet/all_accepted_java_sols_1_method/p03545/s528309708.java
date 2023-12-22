import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = s.charAt(0) - '0';

        sc.close();

        for (int bit = 0; bit < (1 << 3); bit++) {
            int sum = a;
            String ans = "";
            for (int i = 0; i < 3; i++) {
                if ((bit & (1 << i)) != 0) {
                    sum += s.charAt(i + 1) - '0';
                    ans = ans + "+";
                } else {
                    sum -= s.charAt(i + 1) - '0';
                    ans = ans + "-";
                }
            }
            if (sum == 7) {
                for (int i = 0; i < 3; i++) {
                    System.out.print(s.charAt(i));
                    System.out.print(ans.charAt(i));
                }
                System.out.print(s.charAt(3));
                System.out.println("=7");
                return;
            }
        }
    }
}
