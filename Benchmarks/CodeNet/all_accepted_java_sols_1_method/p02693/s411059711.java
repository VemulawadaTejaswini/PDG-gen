import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
        if(B - A >= K) {
            System.out.print("OK");
            return;
        }

        for(int i = A; i < B + 1; i++) {
            if(i % K == 0) {
                System.out.print("OK");
                return;
            }
        }
        System.out.print("NG");
    }
}
