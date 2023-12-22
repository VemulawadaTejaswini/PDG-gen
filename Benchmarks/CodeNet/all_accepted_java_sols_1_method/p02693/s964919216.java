import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        String ans = "";
        int x = a / k;
        int y = b / k;
        int z = a % k;
        int w = b % k;
        if (y - x >= 1 || (z == 0 || w == 0)) ans = "OK";
        else ans = "NG";

        System.out.println(ans);
    }
}
