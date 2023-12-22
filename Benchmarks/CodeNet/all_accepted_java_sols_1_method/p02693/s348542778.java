import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int n = 1;
        while_LB:
        while (n <= 1000) {
            for (int i = 1; i <= 1000; i++) {
                n = K * i;
                if (n >= A && n <= B) {
                    System.out.println("OK");
                    break while_LB;
                }

            }
            System.out.println("NG");
        }
    }
}
