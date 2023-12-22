import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,d;

        n = sc.nextInt();
        d = sc.nextInt();

        int[][] x = new int[n][d];

        double ans = 0;
        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<d;j++){
                x[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int k=i+1;k<n;k++){
                for(int j=0;j<d;j++){
                    if(i!=(n-1)) {
                        ans += Math.pow(Math.abs(x[i][j] - x[k][j]), 2);
                    }else {
                        ans += Math.pow(Math.abs(x[i][j] - x[0][j]), 2);
                    }
                }
                ans = Math.sqrt(ans);
            if(ans == (int)ans){
                count++;
            }
            ans = 0;
            }
        }

        System.out.println(count);
    }
}