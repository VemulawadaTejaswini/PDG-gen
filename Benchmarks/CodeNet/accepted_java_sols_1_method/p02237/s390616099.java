import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] l = new int[n][n];
        for (int i=0;i<n;i++) {
            int a = sc.nextInt() - 1;
            int m = sc.nextInt();
            while(m-->0) {
                l[a][sc.nextInt() - 1]++;
            }
        }
        for(int[] i:l) {
            for(int j=0;j<n;j++) {
                System.out.print(i[j]+(j==n-1?"\n":" "));
            }
        }
    }
}

