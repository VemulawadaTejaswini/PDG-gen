import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        int[] y = new int[M];
        for (int i = 0; i < y.length; i++) {
            y[i] = sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        boolean war = true;
        for (int i = X + 1; i <= Y; i++) {
            if (i > x[x.length - 1] && i <= y[0]) {
                war = false;
            }
        }
        if (war) {
            System.out.println("War");
        } else {
            System.out.println("No War");
        }
        sc.close();
    }
}