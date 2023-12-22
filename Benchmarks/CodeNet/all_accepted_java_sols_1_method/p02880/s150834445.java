import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isok = false;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j == n) {
                    isok = true;
                    break;
                }
            }
        }
        if (isok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
