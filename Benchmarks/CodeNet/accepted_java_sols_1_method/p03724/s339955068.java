import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] a = new int[2][M];
        int[] c = new int[N];
        for(int i = 0; i < M; i++){
            a[0][i] = sc.nextInt();
            c[a[0][i]-1]++;
            a[1][i] = sc.nextInt();
            c[a[1][i]-1]++;
        }
        sc.close();

        for(int i = 0; i < N; i++){
            if(c[i]%2!=0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}