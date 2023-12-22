import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            sum += j;
            max = Math.max(j, max);
        }
        sum -= max;
        if (max < sum) System.out.println("Yes");
        else System.out.println("No");

    }
}