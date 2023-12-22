import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double bumbo = 0.0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            bumbo += 1.0/a;
        }
        double result = 1.0/bumbo;
        System.out.println(result);
    }
}
