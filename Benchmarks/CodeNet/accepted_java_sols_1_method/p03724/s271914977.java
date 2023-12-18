import java.util.Scanner;

/**
 * Created by zzt on 17-5-6.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] degree = new int[n];
        for (int i = 0; i < m; i++) {
            degree[scanner.nextInt()-1] ++;
            degree[scanner.nextInt()-1] ++;
        }
        for (int i = 0; i < n; i++) {
            if (degree[i]%2==1){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}