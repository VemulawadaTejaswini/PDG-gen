import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int max = l[0];
        int sum = l[0];
        for (int i = 1; i < n; i++) {
            if (max < l[i])
                max = l[i];
            sum += l[i];
        }
        if (sum - max - max > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}