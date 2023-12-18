import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] count = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int j = sc.nextInt();
            count[j]++;
            if (count[j] > 2) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}