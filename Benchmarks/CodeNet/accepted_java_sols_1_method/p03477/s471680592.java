
// ABC083A
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String ans = "Left";
        if (n + b < c + d) {
            ans = "Right";
        } else if (n + b == c + d) {
            ans = "Balanced";
        }
        System.out.println(ans);
    }
}