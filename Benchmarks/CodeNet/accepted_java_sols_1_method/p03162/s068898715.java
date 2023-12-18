import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int DP [][] = new int[N][3];
        DP[0][0] = sc.nextInt();
        DP[0][1] = sc.nextInt();
        DP[0][2] = sc.nextInt();
        for(int i=1;i<N;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            DP[i][0] = Math.max(DP[i-1][1],DP[i-1][2])+a;
            DP[i][1] = Math.max(DP[i-1][0],DP[i-1][2])+b;
            DP[i][2] = Math.max(DP[i-1][0],DP[i-1][1])+c;
        }
        int max = 0;
        for(int i:DP[N-1]) if(max<i) max = i;
        System.out.println(max);
    }
}