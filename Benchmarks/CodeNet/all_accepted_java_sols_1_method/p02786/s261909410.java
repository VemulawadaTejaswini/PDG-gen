import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        long ans = 1;
        int cnt = 1;
        while (h > 1) {
            h = Math.floor(h / 2);
            ans += Math.pow(2, cnt);
            cnt++;
        }
        System.out.println(ans);
    }

}
