import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = b;
        if (a >= 13) {

        } else if (a >= 6) {
            ans = b / 2;
        } else {
            ans = 0;
        }
        System.out.println(ans);
        sc.close();
    }
}