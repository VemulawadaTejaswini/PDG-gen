import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);;

    public static void main(String[] args) {
        int X = sc.nextInt();
        int ans = X / 500 * 1000 + X % 500 / 5 * 5;
        System.out.println(ans);
    }
}
