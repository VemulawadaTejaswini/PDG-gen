import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val % 2 == 0 && val % 3 != 0 && val % 5 != 0) {
                System.out.println("DENIED");
                return;
            }
        }
        System.out.println("APPROVED");
    }
}
