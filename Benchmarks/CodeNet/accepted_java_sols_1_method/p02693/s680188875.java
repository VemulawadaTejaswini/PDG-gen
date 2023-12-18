import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        sc.nextLine();
        int A = sc.nextInt();
        int B = sc.nextInt();

        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                System.out.println("OK");
                System.exit(0);
            }
        }

        System.out.println("NG");

    }
}