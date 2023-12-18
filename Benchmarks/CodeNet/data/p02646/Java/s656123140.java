import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();

        boolean flg = false;

        if(a < 0 && b < 0) {
            a = Math.abs(a);
            b = Math.abs(b);
        }

        int i = 0;
        while(i < t) {
            if ((a + v * i) % (b + w * i) == 0) flg = true;
            i++;
            if(flg) break;
        }

        System.out.println(flg ? "YES" : "NO");
    }
}
