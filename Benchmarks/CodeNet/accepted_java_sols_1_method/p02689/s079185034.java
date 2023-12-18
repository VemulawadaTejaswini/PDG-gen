import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0 ; i < n ; i++){
            h[i] = sc.nextInt();
        }
        int[][] a = new int[2][m];
        for(int i = 0 ; i < m ; i++ ){
            a[0][i] = sc.nextInt() - 1;
            a[1][i] = sc.nextInt() - 1;
        }
        sc.close();
        int[] hi = new int[n];
        Arrays.fill(hi , 1);
        for(int i = 0 ; i < m ; i++){
            if(h[a[0][i]] > h[a[1][i]]){
                hi[a[1][i]] = 0;
            }else if(h[a[0][i]] < h[a[1][i]]){
                hi[a[0][i]] = 0;
            }else{
                hi[a[0][i]] = 0;
                hi[a[1][i]] = 0;
            }
        }
        int yono = 0;
        for(int i = 0 ; i < n ; i++){
            yono += hi[i];
        }
        System.out.println(yono);
    }
}