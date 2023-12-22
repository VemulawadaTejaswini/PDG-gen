import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] lr = new int[m][2];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < 2; j++){
                lr[i][j] = scan.nextInt();
            }
        }
        boolean b = true;
        int out = 0;
        int min = lr[0][0];
        int max = lr[0][1];
        for(int i = 1; i < m; i++){
            if(lr[i][0] > min){
                min = lr[i][0];
            }
        }
        for(int i = 1; i < m; i++){
            if(lr[i][1] < max){
                max = lr[i][1];
            }
        }
        for(int i = 1; i <= n; i++){
            a : for(int j = 0; j < m; j++){
                if(min > i || max < i){
                    b = false;
                    break a;
                }
            }
            if(b){
                out++;
            }
            b = true;
        }
        System.out.println(out);
    }
}