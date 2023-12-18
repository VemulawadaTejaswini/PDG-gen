import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int num = s.length();
        char f = s.charAt(0);
        int ans = 0;
        for (int i = 1; i < num; i++) {
            char tmp = s.charAt(i);
            if (f == tmp) {

            } else {
                f = tmp;
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}