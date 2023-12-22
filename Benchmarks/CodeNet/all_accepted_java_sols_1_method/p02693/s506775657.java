import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        boolean ok = false;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                ok = true;
            }
        }
        if (ok) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
        sc.close();
    }
}