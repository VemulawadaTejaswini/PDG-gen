import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        if (k == 1) {
            System.out.println(0);
            return;
        }
        int ans = n - k;
        if (ans <= 0) {
            ans = 0;
        } else {
        }
        System.out.println(ans);

        sc.close();
    }
}
