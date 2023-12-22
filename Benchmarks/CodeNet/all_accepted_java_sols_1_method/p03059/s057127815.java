import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        sc.close();

        int time = a;
        int ans = 0;
        while (time <= t) {
            ans += b;
            time += a;
        }
        System.out.println(ans);
    }

}
