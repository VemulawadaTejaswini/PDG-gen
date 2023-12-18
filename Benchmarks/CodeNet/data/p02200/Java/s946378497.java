import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            if (prev < x) {
                count++;
            }
            prev = x;
        }
        System.out.println(count);
    }
}

