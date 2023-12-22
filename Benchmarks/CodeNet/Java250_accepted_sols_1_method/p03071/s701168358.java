import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ans = 0;
        for (int i = 0; i < 2; i++) {
            ans += Math.max(a,b);
            if (a == ans ) {
                a -= 1;
            } else {
                b -= 1;
            }
        }
        System.out.println(ans);
    }

}
