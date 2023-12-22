import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int n = Integer.parseInt(a + b);
        int sr = (int)Math.sqrt(n);
        if (sr * sr == n) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}