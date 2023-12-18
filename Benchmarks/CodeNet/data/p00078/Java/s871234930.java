import java.util.Scanner;

public class Main {

    static int[][] m(int n){
        int[][] b = new int[n][n];
        int l = n*n,x=n>>1,y=x+1;
        for(int i = 1;i<=l;i++){
            if(x>=n)x=0;
            if(y>=n)y=0;
            while(b[y][x]>0){
                y++;x--;
                if(x<0)x=n-1;
                if(y>=n)y=0;
            }
            b[y][x] = i;
            x++;y++;
        }
        return b;
    }

    public static void main(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n<1)break;
            int[][] b = m(n);
            for(int i = 0;i<n;i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%4d", b[i][j]);
                }
                System.out.println();
            }
        }
    }
}