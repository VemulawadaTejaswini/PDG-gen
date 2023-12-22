import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
        int x4 = in.nextInt();
        int x5 = in.nextInt();

        int ans = 0;
        if (x1 == 0) {
            ans = 1;
        } else if (x2 == 0) {
            ans = 2;
        } else if (x3 == 0) {
            ans = 3;
        } else if (x4 == 0) {
            ans = 4;
        } else {
            ans = 5;
        }
        System.out.println(ans);
    }
}
