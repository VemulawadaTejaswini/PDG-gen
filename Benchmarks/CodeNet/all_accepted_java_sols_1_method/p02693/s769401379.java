import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int AmodK = A % K;
        if (((B - A) >= (K - AmodK)) || (AmodK == 0)) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}