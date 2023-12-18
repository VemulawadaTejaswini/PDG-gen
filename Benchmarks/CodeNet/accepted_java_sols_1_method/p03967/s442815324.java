import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int charge = 0;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (charge > 0) {
                if (c == 'g') {
                    ans++;
                    charge--;

                } else {
                    charge--;

                }
            } else {
                if (c == 'g') {
                    charge++;

                } else {
                    charge++;
                    ans--;

                }
            }
        }
        System.out.println(ans);
        sc.close();
    }

}
