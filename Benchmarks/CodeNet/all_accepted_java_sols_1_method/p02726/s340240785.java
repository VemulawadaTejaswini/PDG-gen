import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt()-1;
        int y = sc.nextInt()-1;
        int[][] d = new int[n][n];
        int ans[] = new int[n];

        for(int i=0;i<n;i++)for(int j=0;j<n;j++)d[i][j]=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int dXY = Math.abs(i-x)+Math.abs(j-y)+1;
                d[i][j]=Math.min(j-i,dXY);
            }
        }

        for(int i=0;i<n;i++)for(int j=0;j<n;j++){
            //System.out.println(i+"to"+j+" "+d[i][j]);
            ans[d[i][j]]++;
        }
        for(int i=1;i<n;i++) System.out.println(ans[i]);
    }

}
