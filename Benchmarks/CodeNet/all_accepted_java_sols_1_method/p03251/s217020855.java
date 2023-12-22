import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[m];
        int maxX = -100;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            maxX = Math.max(maxX, x[i]);
        }
        int minY = 100;
        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
            minY = Math.min(minY, y[i]);
        }

        if (Y <= X) {
            System.out.println("War");
            return;
        }
        if (minY <= maxX) {
            System.out.println("War");
            return;
        }

        Set<Integer> can = new HashSet<>();
        for (int i = X+1; i < Y; i++) {
            can.add(i);
        }
        
        for (int i = maxX+1; i <= minY; i++) {
            if (can.contains(i)) {
                System.out.println("No War");
                return;
            }
        }
        System.out.println("War");
    }
}
