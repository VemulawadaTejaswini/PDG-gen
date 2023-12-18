import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int [] [] a = new int[n][m];
        int [] b = new int [m];
        for (int x = 0; x < n; x++){
            for (int y = 0; y < m; y++){
                a[x] [y] = scan.nextInt();
            }
        }
        for (int y = 0; y < m; y++){
            b[y] = scan.nextInt();
        }
        for(int x = 0; x < n; x++){
            int answer = 0;
            for(int y = 0; y < m; y++) {
                answer = answer + (a[x] [y] * b[y]);
            }
            System.out.println(answer);
        }
    }
}
