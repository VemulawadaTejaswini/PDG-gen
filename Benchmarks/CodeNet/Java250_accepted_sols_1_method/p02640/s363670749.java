import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        String ans = "";
        int tmp1 = y - 2 * x;
        int tmp2 = 4 * x - y;
        if (tmp1 % 2 == 0 && x - (tmp1 / 2) >= 0 && tmp2 % 2 == 0 && (x - tmp2 / 2) >= 0) ans = "Yes";
        else ans = "No";

        System.out.println(ans);
    }
}