import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();

        String ans = a < b && b < c ? "Yes" : "No";

        System.out.println(ans);
    }
}