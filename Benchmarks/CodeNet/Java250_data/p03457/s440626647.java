import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int currentX = 0;
        int currentY = 0;
        int currentTime = 0;
        for (int i = 0; i < n; i++) {
            int restOfTime = (t[i]-currentTime);
            int restOfX = Math.abs(x[i]-currentX);
            int restOfY = Math.abs(y[i]-currentY);
            int subtract = restOfTime - (restOfX + restOfY);
            if(subtract < 0 || subtract % 2 != 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}