import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int thr = in.nextInt();
        in.close();
        int ans = num < thr ? 0 : 10;
        System.out.println(ans);
    }
}