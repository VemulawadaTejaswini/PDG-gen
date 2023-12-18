import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC157A - Duplex Printing

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = (n / 2) + (n % 2);

        System.out.println(ans);
    }
}