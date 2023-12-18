import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        int a = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < a; i++) {
           sum += sc.nextInt();
        }

        System.out.println(sum >= h ? "Yes" : "No");
    }
}