import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int[] copy = x.clone();
        Arrays.sort(copy);
        int first = copy[n / 2 - 1];
        int latter = copy[n / 2];
        for (int i = 0; i < n; i++) {
            if (x[i] <= first)
                System.out.println(latter);
            else
                System.out.println(first);
        }
    }
}
