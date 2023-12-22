import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (n == i * j) {
                    System.out.println("Yes");
                    System.exit(0);
                } 
            }
        }

        System.out.println("No");
    }
}