import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)break;
            int[][] count = new int[n+1][n+1];
            for (int i=0;i<n+1;i++) {
                for (int j=0;j<n +1; j++) {
                    if (i != n && j != n) {
                        int a = sc.nextInt();
                        count[i][j]=a;count[i][n]+=a; count[n][j]+=a;
                    } else if (i==n&& j!= n)  count[n][n]+=count[n][j];
                    System.out.print(String.format("%5d", count[i][j]));
                }
                System.out.println();
            }
        }
 
    }
}