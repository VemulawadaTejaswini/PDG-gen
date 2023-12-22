import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] a = new int[2][M];
        int[] cnt = new int[N];
        for(int i = 0; i < M; i++){
            a[0][i] = sc.nextInt();
            a[1][i] = sc.nextInt();
            cnt[a[0][i]-1]++;
            cnt[a[1][i]-1]++;
        }
        sc.close();
        for(int i = 0; i < N; i++){
            System.out.println(cnt[i]);
        }
    }
}