import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = c;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j] * b[j];
            }
            if (sum > 0) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}						