import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, max = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            sum += temp;
            max = Math.max(max, temp);
        }
        System.out.println(sum-(max/2));

    }
}