import java.util.*;
import java.lang.Object;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] dot = new int[n][d];
        int dis = 0;
        int sum = 0;
        int cnt = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<d;j++){
                dot[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                for(int k = 0;k<d;k++){
                    sum+=(dot[i][k]-dot[j][k])*(dot[i][k]-dot[j][k]);
                }
                int ans = (int)Math.sqrt(sum);
                if(ans == Math.sqrt(sum)){
                    cnt++;
                }
                sum = 0;
            }
        }

            System.out.println(cnt);

    }
}
