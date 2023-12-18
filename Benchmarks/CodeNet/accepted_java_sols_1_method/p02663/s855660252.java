import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int h2 = in.nextInt();
        int m2 = in.nextInt();
        int k = in.nextInt();
        int hm1 = h1*60 + m1;
        int hm2 = h2*60 + m2;
        int ans = Math.max(0, hm2 - hm1 - k);
        System.out.println(ans);
    }
}
