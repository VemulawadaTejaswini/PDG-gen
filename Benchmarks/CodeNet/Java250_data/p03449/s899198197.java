import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[][] l = new int[2][N];
        int ans = 0;
        for(int i = 0;i < N;i++)    l[0][i] = sc.nextInt();
        for(int i = 0;i < N;i++){
            l[1][i] = sc.nextInt();
            ans += l[1][i];
        }
        ans += l[0][0];
        int a = ans;
        for(int i = 1;i < N;i++){
            a = a-l[1][i-1]+l[0][i];
            ans = Math.max(ans, a);
        }
        System.out.println(ans);
    }
}