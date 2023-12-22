import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[m];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }
        int x_max = -100;
        int y_min = 100;
        for (int i = 0; i < n; i++) {
            if (x_max < x[i])
                x_max = x[i];
        }
        for (int i = 0; i < m; i++) {
            if (y_min > y[i])
                y_min = y[i];
        }
        if (X < x_max && x_max < y_min && y_min <= Y)
            System.out.println("No War");
        else
            System.out.println("War");
    }
}