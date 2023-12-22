import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] v = new int[2][n];
        for(int i = 0 ; i < 2 ; i++ ){
            for(int j = 0 ; j < n ; j++ ){
                v[i][j] = sc.nextInt();
            }
        }
        int s = 0;
        for(int i = 0 ; i < n ; i++ ){
            if(v[0][i] > v[1][i]){
                s += (v[0][i] - v[1][i]);
            }
        }
        sc.close();
        System.out.println(s);
    }
}