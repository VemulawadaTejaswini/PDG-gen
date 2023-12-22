import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mi = 1000;
        int ma = 0;
        for (int i = 0; i < n; i++) {
            int an = sc.nextInt();
            mi = Math.min(mi, an);
            ma = Math.max(ma, an);
        }

        System.out.println(ma - mi);
    }

}