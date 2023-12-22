import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int i, j, n;
        int a[][];
        while(true){
            n = sc.nextInt();
            if(n == 0) break;
            a = new int [n + 1][n + 1];
            for(i = 0; i < n; i++){
                for(j = 0; j < n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(i = 0; i < n; i++){
                for(j = 0; j < n; j++){
                    a[i][n] += a[i][j];
                    a[n][i] += a[j][i];
                }
                a[n][n] = a[i][n] + a[n][j];
            }
            for(i = 0; i < n + 1; i++){
                for(j = 0; j < n + 1; j++){
                    System.out.print(String.format("%1$5s", a[i][j]));
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

