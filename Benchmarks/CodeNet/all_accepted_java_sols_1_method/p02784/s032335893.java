import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int sum = 0;
        for (int i =0; i < a; i++) {
            sum += sc.nextInt();
        }
        if (sum >= n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
