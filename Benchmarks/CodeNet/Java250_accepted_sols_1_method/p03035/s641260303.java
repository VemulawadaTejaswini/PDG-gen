import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int ans = 0;
        if (a >= 13) {
            ans = b;
        } else if (a >= 6) {
            ans = b / 2;
        }

        System.out.println(ans);
    }

}
