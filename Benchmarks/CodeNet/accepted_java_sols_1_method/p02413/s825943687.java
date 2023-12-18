import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int [] [] a = new int[n + 1][m + 1];
        for (int x = 0; x < n; x++){
            for(int y = 0; y < m;y++){
                a[x][y] = scan.nextInt();
            }

        }
        int sum = 0;
        for (int x = 0; x < n; x++){
            for(int y = 0; y < m;y++){
                sum = sum + a[x][y];
            }
            a[x] [m] = sum;
            sum = 0;
        }
        for (int x = 0; x < m; x++){
            for(int y = 0; y < n;y++){
                sum = sum + a[y] [x];
            }
            a[n] [x] = sum;
            sum = 0;
        }
        for(int x = 0; x < m; x++){
            sum = sum + a[n] [x];
        }
        a[n] [m] = sum;
        for (int x = 0; x <= n; x++){
            for(int y = 0; y <= m;y++){
                if(y == m){
                    System.out.println(a[x] [m]);
                }
                else{
                    System.out.print(a[x] [y] + " ");
                }
            }
        }
    }
}
