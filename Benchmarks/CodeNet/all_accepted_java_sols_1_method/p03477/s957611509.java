import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = a + b;
        int f = c + d;
        String ans;
        if (e > f) {
            ans = "Left";
        } else if (e == f) {
            ans = "Balanced";
        } else {
            ans = "Right";
        }
        System.out.println(ans);
    }
}