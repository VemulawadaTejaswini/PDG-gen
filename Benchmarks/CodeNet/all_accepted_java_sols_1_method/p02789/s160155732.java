import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC152A - AC or WA

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String ans = (n == m) ? "Yes" : "No";

        System.out.println(ans);
    }
}