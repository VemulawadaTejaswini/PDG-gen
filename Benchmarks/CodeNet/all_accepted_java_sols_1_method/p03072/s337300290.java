import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int inn = sc.nextInt();
            if (inn >= max) {
                count++;
                max = inn;
            }
        }
        System.out.println(count);
    }
}