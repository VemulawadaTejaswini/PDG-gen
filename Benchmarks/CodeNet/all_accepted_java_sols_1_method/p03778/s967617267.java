import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int pos_a = sc.nextInt();
        int pos_b = sc.nextInt();

        int ans;
        int x = pos_b - (pos_a + w);
        int y = pos_a - (pos_b + w);

        if (x > 0) {
            ans = x;
        } else if (y > 0) {
            ans = y;
        } else {
            ans = 0;
        }
        System.out.println(ans);
    }
}