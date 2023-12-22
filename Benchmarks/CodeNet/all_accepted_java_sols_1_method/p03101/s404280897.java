import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();

        int ans = Math.max(H * W - h * W - w * H + w * h, 0);

        System.out.println(ans);

    }
}
