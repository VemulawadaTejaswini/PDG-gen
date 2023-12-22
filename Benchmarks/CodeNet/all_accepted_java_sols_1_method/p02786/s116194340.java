import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long ans = 0;
        long mons = 1;
        while (h > 0) {
            ans += mons;
            mons *= (long) 2;
            h /= 2;
        }
        System.out.println(ans);
    }

}