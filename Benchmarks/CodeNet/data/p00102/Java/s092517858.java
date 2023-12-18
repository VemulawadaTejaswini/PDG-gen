import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[][] list = new int[n + 1][n + 1];
            for (int i = 0; i < n + 1; i++) {
                if (i == n) {
                    int sum=0;
                    for (int j = 0; j < n; j++) {
                        sum+=list[n][j];
                        System.out.printf("%5d",list[n][j] );
                    }
                    System.out.printf("%5d\n",sum);                    
                } else {
                    for (int j = 0; j < n; j++) {
                        int m = sc.nextInt();
                        list[i][j] = m;
                        list[i][n] += m;
                        list[n][j] += m;
                        System.out.printf("%5d",m);
                    }
                    System.out.printf("%5d\n",list[i][n]);
                }
            }
        }
    }
}
